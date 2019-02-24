package com.wise.post.dao;

import com.wise.post.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface PostDao {

    void save(Post post);

    void delete(Long postId);

    void update(Post post);

    Post find(Long postId);

    List<Post> findAll();

}