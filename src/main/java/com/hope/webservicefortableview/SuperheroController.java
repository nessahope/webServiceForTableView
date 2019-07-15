package com.hope.webservicefortableview;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SuperheroController {

    @Autowired
    private SuperheroRepository sRepository;


    @RequestMapping(value = "/superheroes", method = RequestMethod.GET)
    Collection<Superhero> getAllSuperheros(){
        return sRepository.findAll();
    }

    @RequestMapping(value= "/superhero", method = RequestMethod.GET)
    Superhero getSuperheroByName(@RequestParam("name")String name){
        return sRepository.getSuperheroByName(name);
    }
    
    @RequestMapping(value = "/location", method = RequestMethod.GET)
    Collection<Superhero> getSuperherosByBirthPlace(@RequestParam("birthPlace")String location){
        return sRepository.getAllSuperherosByBirthPlace(location);
    }

}