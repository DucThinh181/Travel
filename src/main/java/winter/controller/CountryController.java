package winter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import winter.hibernate.AbstractService;
import winter.http.ResponseFactory;
import static winter.http.ResponseFactory.*;
import winter.model.Country;
import winter.service.CountryService;

import java.util.ArrayList;


/**
 * Created by lequan on 11/5/2016.
 */

@Controller
@RequestMapping("/api/countries")
public class CountryController
{
    @Autowired
    CountryService service;

    ObjectMapper mapper = new ObjectMapper();

    @ResponseBody
    @GetMapping()
    public String get()
    {
        try
        {
            return mapper.writeValueAsString(service.getAll());
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return "[]";
    }

    @ResponseBody
    @GetMapping(path="/{id}")
    public String get(@PathVariable("id") String id)
    {
        try
        {
            return mapper.writeValueAsString(service.get(id));
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return "{}";
    }

    @ResponseBody
    @PostMapping()
    public String add(@RequestBody Country data) throws JsonProcessingException
    {
        try
        {
            service.add(data);
        }
        catch (Exception ex)
        {
            return mapper.writeValueAsString(ResponseFactory.getResponse(ADD_FAIL));
        }
        return mapper.writeValueAsString(ResponseFactory.getResponse(ADD_SUCCESS));
    }

    @ResponseBody
    @PutMapping(path="/{id}")
    public String update(@PathVariable("id") String id, @RequestBody Country data) throws JsonProcessingException
    {
        try
        {
            service.update(data);
        }
        catch (Exception ex)
        {
            return mapper.writeValueAsString(ResponseFactory.getResponse(UPDATE_FAIL));
        }
        return mapper.writeValueAsString(ResponseFactory.getResponse(UPDATE_SUCCESS));
    }

    @ResponseBody
    @DeleteMapping(path="/{id}")
    public String delete(@PathVariable("id") String id) throws JsonProcessingException
    {
        try
        {
            service.delete(id);
        }
        catch (Exception ex)
        {
            return mapper.writeValueAsString(ResponseFactory.getResponse(DELETE_FAIL));
        }
        return mapper.writeValueAsString(ResponseFactory.getResponse(DELETE_SUCCESS));
    }
}
