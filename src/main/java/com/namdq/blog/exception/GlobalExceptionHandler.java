package com.namdq.blog.exception;

import com.namdq.blog.model.EmptyResponse;
import com.namdq.blog.model.ResponseFactory;
import com.namdq.blog.model.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<EmptyResponse> handleException() {
        ResponseStatus responseStatus = new ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString(), "Internal server error.");
        return ResponseFactory.fail(responseStatus);
    }
}
