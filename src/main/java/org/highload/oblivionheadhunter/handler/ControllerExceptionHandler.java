package org.highload.oblivionheadhunter.handler;

import org.highload.oblivionheadhunter.exception.HeroClassNotFoundException;
import org.highload.oblivionheadhunter.exception.RaceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RaceNotFoundException.class)
    protected ResponseEntity<Object> handleRaceNotFound(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "Race was not found";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(HeroClassNotFoundException.class)
    protected ResponseEntity<Object> handleHeroClassNotFound(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "Hero class was not found";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

}
