package com.myblog.controller;

import com.myblog.model.MessageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

    @RestController
    public class BlogController{
        private final List<MessageRequest> messages = new ArrayList<>();
        @PostMapping("/blogs")
        public MessageRequest create(@RequestBody MessageRequest request){

            messages.add(request);

            return request;
        }

        @GetMapping("/blogs")
        public List<MessageRequest> listAllMessage(){
            return messages;
        }

        @GetMapping("/blogs/{index}")
        public MessageRequest getOneMessage(@PathVariable int index){
            return messages.get(index);
        }
    }

