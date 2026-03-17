package com.capg.bank.controller;

import com.capg.bank.constants.AccountConstant;
import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.entity.dto.ResponseDto;
import com.capg.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody AccountDto accountDto)
    {

        accountService.createAccount(accountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountConstant.STATUS_200,AccountConstant.MESSAGE_201,null));
    }


}
