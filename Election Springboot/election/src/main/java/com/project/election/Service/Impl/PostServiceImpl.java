package com.project.election.Service.Impl;

import com.project.election.Entity.Post;
import com.project.election.Repository.PostRepository;
import com.project.election.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
