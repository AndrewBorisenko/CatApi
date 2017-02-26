package CatApi.controller;

import CatApi.entity.Cat;
import CatApi.service.CatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@ComponentScan("CatApi.service")
@RestController
public class CatController {

    @Autowired
    private CatService service;


    @RequestMapping(value = "/cats", method = RequestMethod.GET)
    @ResponseBody
    public List<Cat> getAll()
    {
        return service.getAll();
    }


    @RequestMapping(value = "/cat/id={id}", method = RequestMethod.GET)
    @ResponseBody
    public Cat getByID(@PathVariable("id") long catID)
    {
        return service.getByID(catID);
    }



    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Cat save(@RequestBody Cat cat)
    {
        return service.save(cat);
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void remove(@PathVariable("id") long catID)

    {
        service.remove(catID);
    }

}
