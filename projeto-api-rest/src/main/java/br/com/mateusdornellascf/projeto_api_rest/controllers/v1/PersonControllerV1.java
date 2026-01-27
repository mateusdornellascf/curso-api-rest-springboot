// package br.com.mateusdornellascf.projeto_api_rest.controllers.v1;

// import java.util.Date;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import br.com.mateusdornellascf.projeto_api_rest.data.dto.v1.PersonDTO;
// import br.com.mateusdornellascf.projeto_api_rest.services.v1.PersonServicesV1;

// /**
//  * CONTROLLER LEGADO (V1)
//  *
//  * Versão mantida para fins didáticos e compatibilidade.
//  * Não deve receber novas evoluções.
//  *
//  * Utilize a versão V3 da API.
//  */
// @Deprecated(since = "v3", forRemoval = false)
// @RestController("personControllerV1")
// @RequestMapping("/api/person/v1")
// public class PersonControllerV1 {

//     @Autowired
//     private PersonServicesV1 service;

//     @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//     public List<PersonDTO> findAll() {
//         return service.findAll();
//     }

//     @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//     public PersonDTO findById(@PathVariable("id") Long id) {
//         var person = service.findById(id);

//         // Demonstração didática de serialização
//         person.setBirthDay(new Date());
//         person.setPhoneNumber("+55 (01) 98765-4321");
//         person.setLastName(null);

//         return person;
//     }

//     @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//     public PersonDTO create(@RequestBody PersonDTO person) {
//         return service.create(person);
//     }

//     @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//     public PersonDTO update(@RequestBody PersonDTO person) {
//         return service.update(person);
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> delete(@PathVariable Long id) {
//         service.delete(id);
//         return ResponseEntity.noContent().build();
//     }
// }
