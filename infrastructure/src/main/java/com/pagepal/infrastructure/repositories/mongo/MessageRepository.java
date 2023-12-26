package com.pagepal.infrastructure.repositories.mongo;

import com.pagepal.domain.entities.mongo.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRepository extends MongoRepository<Message, UUID> {
}
