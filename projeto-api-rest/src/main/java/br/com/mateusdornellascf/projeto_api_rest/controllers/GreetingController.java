package br.com.mateusdornellascf.projeto_api_rest.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.mateusdornellascf.projeto_api_rest.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();
    
    //Query Param
    //localhost:8080/greeting?name=xxxxx
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    
    }
}
