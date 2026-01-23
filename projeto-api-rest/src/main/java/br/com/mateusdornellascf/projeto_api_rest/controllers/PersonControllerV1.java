package br.com.mateusdornellascf.projeto_api_rest.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v1.PersonDTOV1;
import br.com.mateusdornellascf.projeto_api_rest.services.PersonServices;

@RestController
@RequestMapping("/api/person/v1")
public class PersonControllerV1 {

    @Autowired
    private PersonServices service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonDTOV1> findAll() {
        return service.findAll();
    }

    @GetMapping(
        value = "/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonDTOV1 findById(@PathVariable Long id) {
        var person = service.findById(id);
        person.setBirthDay(new Date());
        return person;
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonDTOV1 create(@RequestBody PersonDTOV1 person) {
        return service.create(person);
    }

    @PutMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonDTOV1 update(@RequestBody PersonDTOV1 person) {
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
