package br.com.mateusdornellascf.projeto_api_rest.controllers.v3;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.hateoas.PagedModel;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.mateusdornellascf.projeto_api_rest.controllers.v3.docs.PersonControllerDocs;
import br.com.mateusdornellascf.projeto_api_rest.data.dto.v3.PersonDTO;
import br.com.mateusdornellascf.projeto_api_rest.file.exporter.MediaTypes;
import br.com.mateusdornellascf.projeto_api_rest.services.v3.PersonServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@RestController("personControllerV3")
@RequestMapping("/api/person/v3")
@Tag(name = "People", description = "Endpoints for Managing People")
public class PersonController implements PersonControllerDocs {

        @Autowired
        private PersonServices service;

        @Override
        @GetMapping(produces = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE })
        public ResponseEntity<PagedModel<EntityModel<PersonDTO>>> findAll(
                        @RequestParam(value = "page", defaultValue = "0") Integer page,
                        @RequestParam(value = "size", defaultValue = "12") Integer size,
                        @RequestParam(value = "direction", defaultValue = "asc") String direction)

        {
                var sortDirection = "desc".equalsIgnoreCase(direction) ? Direction.DESC
                                : Direction.ASC;
                Pageable pageable = PageRequest.of(page, size,
                                org.springframework.data.domain.Sort.by(sortDirection, "firstName"));
                return ResponseEntity.ok(service.findAll(pageable));
        };

        @GetMapping(value = "/exportPage", produces = {
                        MediaTypes.APPLICATION_XLSX_VALUE,
                        MediaTypes.APPLICATION_CSV_VALUE,
                        MediaTypes.APPLICATION_PDF_VALUE })
        @Override
        public ResponseEntity<Resource> exportPage(
                        @RequestParam(value = "page", defaultValue = "0") Integer page,
                        @RequestParam(value = "size", defaultValue = "12") Integer size,
                        @RequestParam(value = "direction", defaultValue = "asc") String direction,
                        HttpServletRequest request) {
                var sortDirection = "desc".equalsIgnoreCase(direction) ? Direction.DESC : Direction.ASC;
                Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, "firstName"));

                String acceptHeader = request.getHeader(HttpHeaders.ACCEPT);

                Resource file = service.exportPage(pageable, acceptHeader);

                Map<String, String> extensionMap = Map.of(
                                MediaTypes.APPLICATION_XLSX_VALUE, ".xlsx",
                                MediaTypes.APPLICATION_CSV_VALUE, ".csv",
                                MediaTypes.APPLICATION_PDF_VALUE, ".pdf");

                var fileExtension = extensionMap.getOrDefault(acceptHeader, "");
                var contentType = acceptHeader != null ? acceptHeader : "application/octet-stream";
                
                var filename = "people_exported" + fileExtension;

                return ResponseEntity.ok()
                                .contentType(MediaType.parseMediaType(contentType))
                                .header(
                                                HttpHeaders.CONTENT_DISPOSITION,
                                                "attachment; filename=\"" + filename + "\"")
                                .body(file);
        }

        @Override
        @GetMapping(value = "/findPeopleByName/{firstName}", produces = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE })
        public ResponseEntity<PagedModel<EntityModel<PersonDTO>>> findByName(
                        @PathVariable("firstName") String firstName,
                        @RequestParam(value = "page", defaultValue = "0") Integer page,
                        @RequestParam(value = "size", defaultValue = "12") Integer size,
                        @RequestParam(value = "direction", defaultValue = "asc") String direction)

        {
                var sortDirection = "desc".equalsIgnoreCase(direction) ? Direction.DESC
                                : Direction.ASC;
                Pageable pageable = PageRequest.of(page, size,
                                org.springframework.data.domain.Sort.by(sortDirection, "firstName"));
                return ResponseEntity.ok(service.findByName(firstName, pageable));
        };

        @Override
        @GetMapping(value = "/{id}", produces = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE })

        public PersonDTO findById(@PathVariable("id") Long id) {
                return service.findById(id);
        }

        @Override
        @PostMapping(consumes = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE },

                        produces = {
                                        MediaType.APPLICATION_JSON_VALUE,
                                        MediaType.APPLICATION_XML_VALUE,
                                        MediaType.APPLICATION_YAML_VALUE })
        public PersonDTO create(@RequestBody PersonDTO person) {
                return service.create(person);
        }

        @PostMapping(value = "/massCreation", produces = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE })
        @Override
        public List<PersonDTO> massCreation(@RequestParam("file") MultipartFile file) {
                return service.massCreation(file);
        }

        @Override
        @PutMapping(consumes = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE },

                        produces = {
                                        MediaType.APPLICATION_JSON_VALUE,
                                        MediaType.APPLICATION_XML_VALUE,
                                        MediaType.APPLICATION_YAML_VALUE })

        public PersonDTO update(@RequestBody PersonDTO person) {
                return service.update(person);
        }

        @Override
        @DeleteMapping(value = "/{id}")
        public ResponseEntity<?> delete(@PathVariable("id") Long id) {
                service.delete(id);
                return ResponseEntity.noContent().build();
        }

        @PatchMapping(value = "/{id}", produces = {
                        MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_YAML_VALUE })
        @Override
        public PersonDTO disablePerson(@PathVariable("id") Long id) {
                return service.disablePerson(id);
        }

}
