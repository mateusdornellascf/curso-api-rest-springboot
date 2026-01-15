package br.com.mateusdornellascf.projeto_api_rest.exceptions;

import java.util.Date;
public record ExceptionResponse(Date timestamp, String message, String details) {
}
