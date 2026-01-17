package br.com.mateusdornellascf.projeto_api_rest.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import br.com.mateusdornellascf.projeto_api_rest.models.Person;
import java.util.ArrayList;
import java.util.List;
@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<Person>();
        for(int i = 0 ; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person create(Person person){
        logger.info("Creating one person!");
        return person;
    }
    public Person update(Person person){
        logger.info("Updating one person!");
        return person;
    }

    public void delete(String id){
        logger.info("Deleting one person!");

    }


    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("First Name "+ i);
        person.setLastName("Last Name "+ i);
        person.setFirstName("Mateus");
        person.setAddress("Some Address in Brasil");
        person.setGender("Male");
        return person;
    }

    public Person findById(String id){
        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Mateus");
        person.setLastName("Freitas");
        person.setAddress("Recife - PE - Brasil");
        person.setGender("Male");
        return person;
    }
}
