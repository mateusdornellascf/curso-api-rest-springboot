package br.com.mateusdornellascf.projeto_api_rest.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.mateusdornellascf.projeto_api_rest.models.Person;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding one person!");

        Person person = new Person();
        
        //mocked person
        person.setId(counter.incrementAndGet());
        person.setFirstName("Mateus");
        person.setLastName("Freitas");
        person.setFirstName("Mateus");
        person.setAddress("Recife - PE - Brasil");
        person.setGender("Male");
        return person;
    }
}
