package com.app.swasthyamita.advice;

import com.app.swasthyamita.exception.EmptyInputException;
import com.app.swasthyamita.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ErrorControllerAdvice {
    @ExceptionHandler(EmptyInputException.class)
    public ResponseEntity<ApiError> handleEmptyInput(EmptyInputException emptyInputException) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, LocalDateTime.now(), "Data should not be empty");
        return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchFieldException.class)
    public ResponseEntity<ApiError> handleNoSuchField(NoSuchFieldException noSuchFieldException) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, LocalDateTime.now(), "No data found");
        return new ResponseEntity<ApiError>(apiError, HttpStatus.NOT_FOUND);
    }
}


