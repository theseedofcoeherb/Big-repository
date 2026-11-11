package com.myblog.service;

import com.myblog.model.Message;
import com.myblog.model.MessageRequest;
import com.myblog.repository.MessageRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public Message create(MessageRequest request){
        Message msg = new Message(null, request.getContent());
        return messageRepository.save(msg);
    }

    public List<Message> list(){
        return messageRepository.findALL();
    }

    public Optional<Message> findById(Long id){
        return messageRepository.findById(id);
    }
}
