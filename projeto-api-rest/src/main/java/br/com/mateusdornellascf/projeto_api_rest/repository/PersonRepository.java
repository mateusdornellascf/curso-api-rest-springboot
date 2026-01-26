package br.com.mateusdornellascf.projeto_api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateusdornellascf.projeto_api_rest.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
