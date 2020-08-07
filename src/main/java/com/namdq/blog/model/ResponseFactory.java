package com.namdq.blog.model;

import org.springframework.http.ResponseEntity;

public class ResponseFactory {
    private ResponseFactory() {
    }

    public static ResponseEntity<GeneralResponse<Object>> success(Object data, ResponseStatus status) {
        GeneralResponse<Object> response = new GeneralResponse<>(status, data);
        return ResponseEntity.ok(response);
    }

    public static ResponseEntity<GeneralResponse<Object>> success(Object data) {
        ResponseStatus responseStatus = new ResponseStatus("200", "Thành công");
        GeneralResponse<Object> response = new GeneralResponse<>(responseStatus, data);
        return ResponseEntity.ok(response);
    }

    public static ResponseEntity<EmptyResponse> fail(ResponseStatus status) {
        EmptyResponse response = new EmptyResponse(status);
        return ResponseEntity.ok(response);
    }
}
