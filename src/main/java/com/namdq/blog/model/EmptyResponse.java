package com.namdq.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmptyResponse {
    private ResponseStatus status;
}
