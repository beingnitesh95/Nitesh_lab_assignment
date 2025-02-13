package com.bankapp_labexam.bankapp.controller;

import com.bankapp_labexam.bankapp.dto.DepositDto;
import com.bankapp_labexam.bankapp.dto.TranferDto;
import com.bankapp_labexam.bankapp.dto.WithdrawDto;
import com.bankapp_labexam.bankapp.entities.Account;
import com.bankapp_labexam.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AccountController {
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountService.getAll();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable int id) {
        return accountService.finById(id);
    }

    @PostMapping ("transfer")
    public String transfer(@RequestBody TranferDto transferDto) {
        accountService.transfer(transferDto.getFromAccount(), transferDto.getToAccount(), transferDto.getAmount());
        return "Transfer is successful";
    }

    @PostMapping ("deposit")
    public String deposit(@RequestBody DepositDto depositDto) {
        accountService.deposit(depositDto.getAccountId(), depositDto.getAmount());
        return "Deposit is successful";
    }

    @PostMapping ("withdraw")
    public String withdraw(@RequestBody WithdrawDto withdrawDto) {
        accountService.withdraw(withdrawDto.getAccountId(), withdrawDto.getAmount());
        return "Withdraw is successful";
    }

}
