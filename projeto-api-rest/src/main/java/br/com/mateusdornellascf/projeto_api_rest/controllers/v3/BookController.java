package br.com.mateusdornellascf.projeto_api_rest.controllers.v3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateusdornellascf.projeto_api_rest.controllers.v3.docs.BookControllerDocs;
import br.com.mateusdornellascf.projeto_api_rest.data.dto.v3.BookDTO;
import br.com.mateusdornellascf.projeto_api_rest.services.v3.BookServices;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController("bookControllerV3")
@RequestMapping("/api/book/v3")
@Tag(name = "Book", description = "Endpoints for Managing Books")
public class BookController implements BookControllerDocs {

    @Autowired
    private BookServices service;
    // private BookServices service = new BookServices();

    @Override
    @GetMapping(
        produces = {
        MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_YAML_VALUE}
    )
    public List<BookDTO> findAll() {
        return service.findAll();
    }

    @Override
    @GetMapping(value = "/{id}", produces ={
        MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_YAML_VALUE}
    )

    public BookDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @Override
    @PostMapping(consumes = {
        MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_YAML_VALUE},
        
        produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_YAML_VALUE}
        )
    
    public BookDTO create(@RequestBody BookDTO person) {
        return service.create(person);
    }

    @Override
    @PutMapping(consumes = {
        MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_YAML_VALUE},
        
        produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_YAML_VALUE}
        )

    public BookDTO update(@RequestBody BookDTO person) {
        return service.update(person);
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
