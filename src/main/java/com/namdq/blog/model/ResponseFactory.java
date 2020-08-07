package com.namdq.blog.model;

import org.springframework.http.ResponseEntity;

public class ResponseFactory {
    private ResponseFactory() {
    }

    public static ResponseEntity<GeneralResponse<Object>> success(Object data, ResponseStatus status) {
        GeneralResponse<Object> response = new GeneralResponse<>(status, data);
        return ResponseEntity.ok(response);
    }
}
