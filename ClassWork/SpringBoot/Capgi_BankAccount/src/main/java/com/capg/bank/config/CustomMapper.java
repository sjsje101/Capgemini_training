package com.capg.bank.config;

import com.capg.bank.entity.Account;
import com.capg.bank.entity.dto.AccountDto;

public class CustomMapper {
    public static Account mapAccontDtoToAccount(AccountDto accountDto ,Account account)
    {
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setAccountType(accountDto.getAccountType());
        account.setAccountSecureKey(accountDto.getAccountSecureKey());
        account.setHolderEmail(accountDto.getHolderEmail());
        account.setBalance(accountDto.getBalance());
        return account;
    }
}
