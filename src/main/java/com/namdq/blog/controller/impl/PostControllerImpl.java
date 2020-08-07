package com.namdq.blog.controller.impl;

import com.namdq.blog.controller.PostController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostControllerImpl implements PostController {

  @Override
  public String hello() {
    return "Hello";
  }
}
