package com.namdq.blog.controller;

import com.namdq.blog.model.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface PostController {

    @GetMapping("/posts")
    ResponseEntity<GeneralResponse<Object>> findAll(@RequestParam Integer index, @RequestParam Integer size);
}
