package com.capg.bank.entity;

import com.capg.bank.entity.dto.AccountType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_seq")
    @SequenceGenerator(name = "bank_seq", sequenceName = "bank_seq", allocationSize = 1)
    private Integer accountId;
    private String accountHolderName;
    private String holderEmail;
    private String accountSecureKey;
    private Long balance;
    private AccountType accountType;

}
