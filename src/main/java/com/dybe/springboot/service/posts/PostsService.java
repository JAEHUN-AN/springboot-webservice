package com.dybe.springboot.service.posts;

import com.dybe.springboot.domain.posts.Posts;
import com.dybe.springboot.domain.posts.PostsRepository;
import com.dybe.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.transaction.Transactional;


    @RequiredArgsConstructor
    @Service

    public class PostsService{
        private final PostsRepository postsRepository;

        @Transactional
        public Long save(PostsSaveRequestDto requestDto){
            return postsRepository.save(requestDto.toEntity()).getId();
        }
    }

