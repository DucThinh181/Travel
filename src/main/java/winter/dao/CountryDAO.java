package winter.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import winter.hibernate.AbstractDAO;
import winter.model.Country;

/**
 * Created by lequan on 11/5/2016.
 */
public class CountryDAO extends AbstractDAO<Country>
{
/*
    public void updateId(String oldId, String newId)
    {
        String hql = "update table set id=? where id=?";
        Session session = getSession();
        Query query =   session.createQuery(hql);
        //query.setString(0, getDomainClassName());
        query.setString(0, newId);
        query.setString(1, oldId);
        query.executeUpdate();
        session.beginTransaction().commit();
    }*/
    /*public static City get(int ID)
    {
        City obj = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        try
        {
            obj = (City) session.get(City.class, ID);
        } catch (HibernateException ex)
        {
            //System.err.println(ex);
        } finally
        {
            session.close();
        }
        return obj;
    }

    public static boolean add(City obj)
    {
        Session session = HibernateUtils.getSessionFactory().openSession();
        if (get(obj.getId()) != null)
        {
            return false;
        }
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(obj);
            transaction.commit();
        } catch (HibernateException ex)
        {
            transaction.rollback();
            //System.err.println(ex);
        } finally
        {
            session.close();
        }
        return true;
    }*/
}
