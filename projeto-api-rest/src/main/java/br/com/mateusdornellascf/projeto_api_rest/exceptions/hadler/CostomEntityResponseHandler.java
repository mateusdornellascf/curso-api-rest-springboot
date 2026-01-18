package br.com.mateusdornellascf.projeto_api_rest.exceptions.hadler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;
import br.com.mateusdornellascf.projeto_api_rest.exceptions.ExceptionResponse;
import br.com.mateusdornellascf.projeto_api_rest.exceptions.ResourceNotFoundException;

import java.util.Date;

@RestController
@ControllerAdvice
public class CostomEntityResponseHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundRequestExceptions(Exception ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
