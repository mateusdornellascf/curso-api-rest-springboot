package br.com.mateusdornellascf.projeto_api_rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v2.PersonDTOV2;

/**
 * @deprecated
 *             API v2 DESCONTINUADA.
 *
 *             Motivo:
 *             - Mantida apenas para fins de documentação e referência
 *             histórica.
 *
 *             Status:
 *             - NÃO deve ser utilizada em novos desenvolvimentos.
 *             - Pode ser removida definitivamente no futuro.
 */

@Deprecated
@RestController
@RequestMapping("/api/person/v2")
public class PersonControllerV2 {

    private static final String DEPRECATION_MESSAGE = "API v2 descontinuada. Utilize a versão mais recente da API.";

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.GONE)
                .header("Warning", "299 - API v2 is deprecated")
                .body(DEPRECATION_MESSAGE);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody PersonDTOV2 person) {
        return ResponseEntity
                .status(HttpStatus.GONE)
                .header("Warning", "299 - API v2 is deprecated")
                .body(DEPRECATION_MESSAGE);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody PersonDTOV2 person) {
        return ResponseEntity
                .status(HttpStatus.GONE)
                .header("Warning", "299 - API v2 is deprecated")
                .body(DEPRECATION_MESSAGE);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.GONE)
                .header("Warning", "299 - API v2 is deprecated")
                .body(DEPRECATION_MESSAGE);
    }
}
