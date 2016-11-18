package winter.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import winter.dao.CountryDAO;
import winter.model.Country;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lequan on 11/14/2016.
 */
@Transactional
@Service("abstractService")
public class AbstractService<T>
{
   /* @Autowired*/
  private   AbstractDAO<T> dao;

    public T get(Serializable id)
    {
        return dao.get(id);
    }

    public ArrayList getAll()
    {
        return  dao.getAll();
    }

    public void add(T obj)
    {
        dao.add(obj);
    }

    public void update(T obj)
    {
        dao.update(obj);
    }

    public void delete(Serializable id)
    {
        dao.delete(dao.get(id));
    }
}
