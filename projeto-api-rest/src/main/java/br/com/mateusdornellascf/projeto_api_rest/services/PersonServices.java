package br.com.mateusdornellascf.projeto_api_rest.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.mateusdornellascf.projeto_api_rest.models.Person;
import br.com.mateusdornellascf.projeto_api_rest.repository.PersonRepository;
import java.util.List;
@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    
    @Autowired
    PersonRepository repository;

    public List<Person> findAll(){
        return repository.findAll();
    }

    public Person create(Person person){
        logger.info("Creating one person!");
        return repository.save(person);
    }
    public Person update(Person person){
        logger.info("Updating one person!");
        Person entity = repository.findById(person.getId()).orElseThrow(()-> new RuntimeException("No records found for this ID"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }

    public void delete(Long id){
        logger.info("Deleting one person!");
        Person entity = repository.findById(id).orElseThrow(()-> new RuntimeException("No records found for this ID"));
        repository.delete(entity);
    }

    public Person findById(Long id){
        logger.info("Finding one person!");

        return repository.findById(id).orElseThrow(()-> new RuntimeException("No records found for this ID"));
    }
}
