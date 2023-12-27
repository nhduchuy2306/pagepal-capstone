package com.pagepal.domain.entities.mongo;

import com.pagepal.domain.enums.MessageStateEnum;
import com.pagepal.domain.enums.MessageTypeEnum;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "MESSAGES")
public class Message {
    @Id
    private UUID id;

    @Field("type")
    private MessageTypeEnum type;

    @Field("attachment_url")
    private String attachmentUrl;

    @Field("created_at")
    private Date createdAt;

    @Field("deleted_at")
    private Date deletedAt;

    @Field("state")
    private MessageStateEnum state;

    private Conversation conversation;
}
