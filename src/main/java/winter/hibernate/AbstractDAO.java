package winter.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lequan on 11/9/2016.
 */
public class AbstractDAO<T> implements DAO<T>
{
    @Autowired
    SessionFactory sessionFactory;

  public  Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

    Class<T> domainClass;

    Class<T> getDomainClass()
    {
        if (domainClass == null)
        {
            ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
            domainClass = (Class<T>) type.getActualTypeArguments()[0];
        }

        return domainClass;
    }

    public  String getDomainClassName()
    {
        return getDomainClass().getName();
    }

    public void add(T t)
    {
        Method method = ReflectionUtils.findMethod(getDomainClass(), "", new Class[]{Date.class});
        if (method != null)
        {
            try
            {
                method.invoke(t, new Date());
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
            catch (InvocationTargetException e)
            {
                e.printStackTrace();
            }
        }
        getSession().save(t);
    }

    public T get(Serializable id)
    {
        return (T) getSession().get(getDomainClass(), id);
    }

    public ArrayList getAll()
    {
        return (ArrayList) getSession().createQuery("from " + getDomainClassName()).list();
    }

    public void update(T t)
    {
        getSession().update(t);
    }


    public void delete(T t)
    {
        getSession().delete(t);
    }
}
