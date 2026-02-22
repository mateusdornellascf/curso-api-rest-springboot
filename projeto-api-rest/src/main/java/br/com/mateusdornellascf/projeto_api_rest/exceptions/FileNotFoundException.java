package br.com.mateusdornellascf.projeto_api_rest.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(String menssage) {
        super(menssage);
    }
    public FileNotFoundException(String menssage,Throwable cause) {
        super(menssage, cause);
    }
    
}
