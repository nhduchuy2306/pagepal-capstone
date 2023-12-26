package com.pagepal.domain.entities.postgre;

import com.pagepal.domain.entities.BaseEntity;
import com.pagepal.domain.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WALLET")
@Where(clause = "status = 'ACTIVE'")
public class Wallet extends BaseEntity {
    @Column(name = "token_amount")
    private Integer tokenAmount;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "wallet_type_id")
    private WalletType walletType;
}
