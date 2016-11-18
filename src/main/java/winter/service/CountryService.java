package winter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import winter.dao.CountryDAO;
import winter.hibernate.AbstractService;
import winter.model.Country;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * Created by lequan on 11/9/2016.
 */
@Transactional
@Service("countryService")
public class CountryService extends AbstractService<Country>
{
    @Autowired
    CountryDAO dao;

    public Country get(String id)
    {
        return dao.get(id);
    }

    public ArrayList<Country> getAll()
    {
      return  dao.getAll();
    }

    public void add(Country obj)
    {
        dao.add(obj);
    }

    public void update(Country obj)
    {

        dao.update(obj);
    }

   /* public void updateId(String oldId, String newId)
{

    dao.updateId(oldId, newId);
}*/

    public void delete(String id)
    {
        dao.delete(dao.get(id));
    }
}
