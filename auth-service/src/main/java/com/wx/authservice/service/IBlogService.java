package com.wx.authservice.service;


import com.wx.authservice.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getBlogs();

    void deleteBlog(long id);
}
