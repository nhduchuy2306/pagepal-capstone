package com.pagepal.domain.entities.mongo;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "POST_COMMENTS")
public class PostComment {

    @Id
    private UUID id;
}
