package com.namdq.blog.service;

import com.namdq.blog.dto.PostDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {

    Page<PostDto> findAll(Pageable pageable);

    PostDto findById(Integer postId);

    PostDto create(PostDto postDto);

    PostDto updateById(Integer postId, PostDto postDto);

    PostDto moveToDraftById(Integer postId);

    boolean deleteById(Integer integer);
}
