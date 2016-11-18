package winter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import winter.hibernate.AbstractService;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

/**
 * Created by lequan on 11/5/2016.
 */

//@Controller
public class AbstractController<T>
{
    AbstractService<T> service;
    ObjectMapper mapper = new ObjectMapper();

    public AbstractController(AbstractService<T> service)
    {
        this.service = service;
    }

    @ResponseBody
    @GetMapping()
    public String get()
    {
        try
        {
            ArrayList list = service.getAll();
            return mapper.writeValueAsString(list);
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return "[]";
    }

    @ResponseBody
    @GetMapping(path="/{id}")
    public String get(@PathVariable("id") Serializable id)
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
    public void add(@RequestBody T data)
    {
        service.add(data);
    }

    @ResponseBody
    @PutMapping(path="/{id}")
    public void update(@PathVariable("id") String id, @RequestBody T data)
    {
        service.update(data);
    }

    @ResponseBody
    @DeleteMapping(path="/{id}")
    public void delete(@PathVariable("id") String id)
    {
        service.delete(id);
    }
}
