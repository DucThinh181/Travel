package winter.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import winter.model.City;
import winter.model.Country;
import winter.service.CityService;
import winter.service.CountryService;

import java.util.ArrayList;

/**
 * Created by lequan on 11/5/2016.
 */

@Controller
public class CountryControl
{

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    CityService service;



}
