package com.myblog.repository;

import com.myblog.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public class InMemoryMessageRepository implements MessageRepository{
    private final List<Message> store = new ArrayList<>();
    private long idSequence = 1L;

    @Override
    public Message save(Message message) {
        message.setId(idSequence++);
        store.add(message);
        return message;
    }

    @Override
    public List<Message> findALL() {
        return new ArrayList<>(store);
    }

    @Override
    public Optional<Message> findById(Long id) {
        return store.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst();
    }
}
