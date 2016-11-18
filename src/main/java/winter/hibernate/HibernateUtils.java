package winter.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

/**
 * Created by lequan on 11/5/2016.
 */
public class HibernateUtils
{
    private static final SessionFactory sessionFactory;

    static
    {
        try
        {
            // Create the SessionFactory from standard (hibernate.cfg.xml) config file.
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex)
        {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    public static int getNextID(String pojo, String id)
    {
        Session session = getSessionFactory().openSession();
        String hql = "select max(obj." + id + ") from " + pojo + " obj";
        Query query = session.createQuery(hql);
        Object max = query.uniqueResult();
        if (max == null)
            return 1;
        return (Integer)max + 1;
    }
}
