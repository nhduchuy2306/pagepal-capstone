package com.pagepal.domain.entities.postgre;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pagepal.domain.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT")
@Where(clause = "status = 'ACTIVE'")
public class Account extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "account_state_id")
    private AccountState accountState;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Wallet> wallets;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
