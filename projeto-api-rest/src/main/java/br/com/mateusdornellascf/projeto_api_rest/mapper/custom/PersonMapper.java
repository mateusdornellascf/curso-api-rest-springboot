package br.com.mateusdornellascf.projeto_api_rest.mapper.custom;

import java.util.Date;
import br.com.mateusdornellascf.projeto_api_rest.data.dto.v2.PersonDTO;
import br.com.mateusdornellascf.projeto_api_rest.models.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonMapper {
    public PersonDTO convertEntityToDTO(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthDay(new Date());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertDTOtoEntity(PersonDTO person) {
        Person entity = new Person();
        entity.setId(person.getId());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        // entity.setBirthDay(new Date());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return entity;
    }
}
//
