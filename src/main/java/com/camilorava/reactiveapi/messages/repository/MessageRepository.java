package com.camilorava.reactiveapi.messages.repository;

import com.camilorava.reactiveapi.messages.domain.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MessageRepository extends ReactiveMongoRepository<Message, String> {
    Flux<Message> findByThreadId(String threadId);
}

