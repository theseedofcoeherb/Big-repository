package com.myblog.controller;

import com.myblog.model.Message;
import com.myblog.model.MessageRequest;
import com.myblog.service.MessageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class MessageController {
    private final MessageService messageService;
    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }

    @PostMapping("/messages")
    public Message create(@RequestBody MessageRequest request){
        return messageService.create(request);
    }

    @GetMapping("/messages")
    public List<Message> listAll(){
        return messageService.list();
    }

    @GetMapping("/messages/{id}")
    public Message getOne(@PathVariable Long id){
        return messageService.findById(id).orElseThrow(() -> new RuntimeException("找不到"));
    }
}

