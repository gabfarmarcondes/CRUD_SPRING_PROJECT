package com.project.crud.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class UserException {

    private final Logger logger = LoggerFactory.getLogger(UserException.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> illegalArgumentException(IllegalArgumentException userException) {
        return new ResponseEntity<>(userException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> NoSuchElementException(NoSuchElementException userException) {
        return new ResponseEntity<>(userException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TypeMismatchException.class)
    public ResponseEntity<String> TypeMismatchException(TypeMismatchException userException) {
        return new ResponseEntity<>(userException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> Throwable(Throwable throwable) {
        return new ResponseEntity<>(throwable.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
