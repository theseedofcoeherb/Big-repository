package com.myblog.controller;

import com.myblog.model.BlogProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        return "Hello,I Exist.";
    }

    @GetMapping("/profile")
    public BlogProfile profile() {
        BlogProfile blogProfile = new BlogProfile();
        blogProfile.name = "MyBlog";
        blogProfile.owner = "name?";
        blogProfile.message = "Nice to meet you.";
        return blogProfile;
    }
}