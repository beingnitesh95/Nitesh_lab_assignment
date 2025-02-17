package com.bankapp.controller;

import com.bankapp.dao.impl.Account;
import com.bankapp.exception.AccountNotFoundException;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class BankAppController {

    @RestController
    public class AccountController {


        private AccountService accountService;
        @Autowired
        public AccountController(AccountService accountService) {
            this.accountService = accountService;
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<List<Account>> getAllAccounts(){
            return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
        }
    }
}
