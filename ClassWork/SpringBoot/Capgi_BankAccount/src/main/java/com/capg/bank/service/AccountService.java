package com.capg.bank.service;

import com.capg.bank.entity.dto.AccountDto;
import org.springframework.stereotype.Service;

public interface AccountService {
    void createAccount(AccountDto accountDto);
}
