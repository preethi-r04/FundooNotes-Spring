package com.bridgelabz.fundoo_notes.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(RuntimeException.class)
    public String handleException(RuntimeException ex) {
        return ex.getMessage();
    }
}