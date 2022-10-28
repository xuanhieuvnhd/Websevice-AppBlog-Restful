package com.codegym.service;

import com.codegym.model.Blog;


public interface BlogService {

    Iterable<Blog> findAll();

    void save(Blog blog);

    void remove(long id);

    Blog findById(long id);

}
