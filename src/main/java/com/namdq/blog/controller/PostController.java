package com.namdq.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface PostController {

  @GetMapping("/hello")
  String hello();
}
