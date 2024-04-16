package com.codestates.message;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message creatMessage(Message message) {
        return messageRepository.save(message);
    }
}
