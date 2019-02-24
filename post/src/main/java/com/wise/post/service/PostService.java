package com.wise.post.service;

import java.util.Map;

import com.wise.post.model.Post;

public interface PostService {

    void createPost(Post post);

    void deletePost(Long postId);

    void updatePost(Post post);

    Map<String, Object> findPost(Long postId);

    Map<String, Object> findAllPosts();

}