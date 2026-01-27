package br.com.mateusdornellascf.projeto_api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateusdornellascf.projeto_api_rest.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}