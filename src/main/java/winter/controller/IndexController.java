package winter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lequan on 11/5/2016.
 */

@Controller
@RequestMapping("/")
public class IndexController
{
    @GetMapping
    public String getPage(Model model)
    {
        model.addAttribute("page", "index");
        return "index";
    }

    @GetMapping()
    @RequestMapping("/country")
    public String routeCountry(Model model)
    {
        model.addAttribute("page", getMapping(new Object(){}));
        return "index";
    }

    @GetMapping()
    @RequestMapping("/city")
    public String routeCity(Model model)
    {
        model.addAttribute("page", getMapping(new Object(){}));
        return "index";
    }


    String getMapping(Object instance)
    {
    /*    String controllerMapping = getClass().getAnnotation(RequestMapping.class).value()[0];
        return controllerMapping.substring(1);*/
        String mapping = instance.getClass().getEnclosingMethod().getAnnotation(RequestMapping.class).value()[0];
        return mapping.substring(1);
    }
}
