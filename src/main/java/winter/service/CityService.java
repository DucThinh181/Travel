package winter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import winter.dao.CityDAO;
import winter.dao.CityDAO;
import winter.model.City;
import winter.model.City;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * Created by lequan on 11/9/2016.
 */
@Transactional
@Service("cityService")
public class CityService
{
    @Autowired
    CityDAO dao;

    public City get(String id)
    {
        return dao.get(id);
    }

    public ArrayList<City> getAll()
    {
        return  dao.getAll();
    }

    public void add(City obj)
    {
        dao.add(obj);
    }

    public void update(City obj)
    {

        dao.update(obj);
    }
    public void delete(String id)
    {
        dao.delete(dao.get(id));
    }
}
