package winter.api;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import winter.dao.CityDAO;
import winter.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import winter.service.CityService;

import java.util.ArrayList;

/**
 * Created by lequan on 11/5/2016.
 */

@Controller
@RequestMapping("/a")
public class CityControl
{
    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    CityService service;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String getCity()
    {
       /* ArrayList<City> list = new ArrayList<City>();
        list.add(new City(1, "VN", "Viet Nam"));
        try
        {
            City i = service.get(1);
            return mapper.writeValueAsString(i);
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }*/
        return "{}";
    }
}
