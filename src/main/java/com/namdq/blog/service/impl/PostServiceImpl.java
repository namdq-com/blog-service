package com.namdq.blog.service.impl;

import com.namdq.blog.dto.PostDto;
import com.namdq.blog.mapper.ObjectMapper;
import com.namdq.blog.repository.PostRepository;
import com.namdq.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Page<PostDto> findAll(Pageable pageable) {
        return ObjectMapper.mapAll(postRepository.findAll(pageable), PostDto.class);
    }

    @Override
    public PostDto findById(Integer postId) {
        return null;
    }

    @Override
    public PostDto create(PostDto postDto) {
        return null;
    }

    @Override
    public PostDto updateById(Integer postId, PostDto postDto) {
        return null;
    }

    @Override
    public PostDto moveToDraftById(Integer postId) {
        return null;
    }

    @Override
    public boolean deleteById(Integer integer) {
        return false;
    }
}
