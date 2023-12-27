package com.pagepal.domain.entities.mongo;

import com.pagepal.domain.entities.postgre.Customer;
import com.pagepal.domain.entities.postgre.Reader;
import com.pagepal.domain.enums.Status;
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
@Document(collection = "CONVERSATIONS")
public class Conversation {
    @Id
    private UUID id;

    @Field("title")
    private String title;

    @Field("created_at")
    private Date createdAt;

    @Field("updated_at")
    private Date updatedAt;

    @Field("deleted_at")
    private Date deletedAt;

    @Field("status")
    private Status status;

    private Reader reader;

    private Customer customer;
}
