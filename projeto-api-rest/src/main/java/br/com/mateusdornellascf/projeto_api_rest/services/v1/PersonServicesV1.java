package br.com.mateusdornellascf.projeto_api_rest.services.v1;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v1.PersonDTO;
import br.com.mateusdornellascf.projeto_api_rest.exceptions.ResourceNotFoundException;
import br.com.mateusdornellascf.projeto_api_rest.mapper.ObjectMapper;
import br.com.mateusdornellascf.projeto_api_rest.models.Person;
import br.com.mateusdornellascf.projeto_api_rest.repository.PersonRepository;

/**
 * SERVICE LEGADO (V1)
 *
 * Mantido apenas para compatibilidade com a API V1.
 * Não deve receber novas evoluções.
 */
@Service
public class PersonServicesV1 {

    private Logger logger = LoggerFactory.getLogger(PersonServicesV1.class);

    @Autowired
    private PersonRepository repository;

    public List<PersonDTO> findAll() {
        logger.info("Finding all People (V1)");
        return ObjectMapper.parseListObjects(repository.findAll(), PersonDTO.class);
    }

    public PersonDTO findById(Long id) {
        logger.info("Finding one Person (V1)");
        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        return ObjectMapper.parseObject(entity, PersonDTO.class);
    }

    public PersonDTO create(PersonDTO person) {
        logger.info("Creating one Person (V1)");

        Person entity = ObjectMapper.parseObject(person, Person.class);
        return ObjectMapper.parseObject(repository.save(entity), PersonDTO.class);
    }

    public PersonDTO update(PersonDTO person) {
        logger.info("Updating one Person (V1)");

        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return ObjectMapper.parseObject(repository.save(entity), PersonDTO.class);
    }

    public void delete(Long id) {
        logger.info("Deleting one Person (V1)");

        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        repository.delete(entity);
    }
}
