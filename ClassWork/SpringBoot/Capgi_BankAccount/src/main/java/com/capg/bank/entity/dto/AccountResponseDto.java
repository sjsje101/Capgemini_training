package com.capg.bank.entity.dto;

import lombok.Data;

@Data
public class AccountResponseDto {
    private Long balance;
    private  AccountType accountType;
//    private String holderEmail;
//    private String accountSecureKey;
    private String accountHolderName;
    private Integer accountId;

}
