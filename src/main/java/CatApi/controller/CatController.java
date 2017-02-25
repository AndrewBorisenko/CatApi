package CatApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CatController
{
    @RequestMapping(value = "/getcat", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model)
    {
        return "MyFirstCATrequest";
    }
}