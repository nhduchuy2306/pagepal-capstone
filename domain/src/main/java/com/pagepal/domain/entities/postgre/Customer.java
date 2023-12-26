package com.pagepal.domain.entities.postgre;

import com.pagepal.domain.entities.BaseEntity;
import com.pagepal.domain.enums.GenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
@Where(clause = "status = 'ACTIVE'")
public class Customer extends BaseEntity {

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "image_url")
    private String imageUrl;
}
