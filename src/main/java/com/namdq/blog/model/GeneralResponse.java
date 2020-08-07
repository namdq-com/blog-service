package com.namdq.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralResponse<T> {
    private ResponseStatus status;
    private T data;
}
