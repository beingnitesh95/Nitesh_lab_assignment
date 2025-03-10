package com.bankapp.bankapp01.Controller;

import com.bankapp.bankapp01.dto.AccountDto;
import com.bankapp.bankapp01.entities.Account;
import com.bankapp.bankapp01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AccountCrudController {

    private AccountService accountService;

    @Autowired
    public AccountCrudController(AccountService accountService) {
        this.accountService = accountService;
    }

    //get all account
    @GetMapping("account")
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    //get by id
    @GetMapping("account/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable int id) {
        return ResponseEntity.ok(accountService.getAccount(id));
    }

}
