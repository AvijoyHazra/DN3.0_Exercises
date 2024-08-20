package com.springrest.bookstoreapi.exception;

import com.springrest.bookstoreapi.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Book> resourceNotFoundExceptionHandler(ResourceNotFoundException e)
    {
        String msg=e.getMessage();
    }
}
