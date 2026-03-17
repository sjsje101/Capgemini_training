package com.capg.bank.service.impl;

import com.capg.bank.config.CustomMapper;
import com.capg.bank.entity.Account;
import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.repository.AccountRepository;
import com.capg.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;


    @Override
    public void createAccount(AccountDto accountDto) {
//        Account account = new Account();
//        account.setAccountHolderName(accountDto.getAccountHolderName());
//        account.setAccountType(accountDto.getAccountType());
//        account.setAccountSecureKey(accountDto.getAccountSecureKey());
//        account.setHolderEmail(accountDto.getHolderEmail());
//        account.setBalance(accountDto.getBalance());
        Account account = CustomMapper.mapAccontDtoToAccount(accountDto, new Account());
        accountRepository.save(account);

    }
}
