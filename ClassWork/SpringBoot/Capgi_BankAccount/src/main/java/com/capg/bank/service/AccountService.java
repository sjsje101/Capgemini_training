package com.capg.bank.service;

import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.entity.dto.AccountResponseDto;

import java.util.List;

public interface AccountService {
    void createAccount(AccountDto accountDto);

    AccountResponseDto getAccountById(Integer id);

    List<AccountResponseDto> findAll();
}
