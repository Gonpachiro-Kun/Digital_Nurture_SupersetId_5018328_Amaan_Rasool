package com.BookstoreAPI.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler {
    @ExceptionHandler(BookAlreadyExistsException.class)
    public ResponseEntity<String> Handle(BookAlreadyExistsException e){
        return ResponseEntity.status(400).body(e.getMessage());
    }
}
