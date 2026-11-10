package com.myblog.controller;

import com.myblog.model.BlogProfile;
import com.myblog.model.MeResponse;
import com.myblog.model.PersonalProfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        return "Hello,I Exist.";
    }

    @GetMapping("/profile")
//    public String profile(){
//        return "name=Myblog,owner=Student,message=Hello";
//    }
//    public BlogProfile profile() {
//        BlogProfile blogProfile = new BlogProfile();
//        blogProfile.name = "MyBlog";
//        blogProfile.owner = "herb";
//        blogProfile.message = "Nice to meet you.";
//        blogProfile.hobby ="play my video games";
//        blogProfile.city="Guang";
//        return blogProfile;
//    }
    public PersonalProfile profile() {
        PersonalProfile profile = new PersonalProfile();
        profile.blogName = "cbt";
        profile.owner = "herb";
        profile.introduction = "objection";
        profile.interests = "coffee";
        profile.vision = "nothing";
        return profile;
    }

    @GetMapping("/me")
    public MeResponse me() {
        MeResponse meResponse = new MeResponse();
        meResponse.name = "MyBlog";
        meResponse.owner = "herb";
        return meResponse;
    }
}