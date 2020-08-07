package com.namdq.blog.controller.impl;

import com.namdq.blog.controller.PostController;
import com.namdq.blog.dto.PostDto;
import com.namdq.blog.model.GeneralResponse;
import com.namdq.blog.model.ResponseFactory;
import com.namdq.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostControllerImpl implements PostController {

    private final PostService postService;

    @Autowired
    public PostControllerImpl(PostService postService) {
        this.postService = postService;
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> findAll(Integer page, Integer size) {
        Page<PostDto> postDtoList = postService.findAll(PageRequest.of(page, size));
        return ResponseFactory.success(postDtoList);
    }
}
