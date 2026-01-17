package br.com.mateusdornellascf.projeto_api_rest.controllers;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

import br.com.mateusdornellascf.projeto_api_rest.services.PersonServices;
import br.com.mateusdornellascf.projeto_api_rest.models.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @RequestMapping(value = "/{id}", 
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE

    )
    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
         
    }
}