package com.bankapp.bankapp01.Controller;

import com.bankapp.bankapp01.dto.DepositDto;
import com.bankapp.bankapp01.dto.TransferDto;
import com.bankapp.bankapp01.dto.WithdrawDto;
import com.bankapp.bankapp01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AccountTransactionController {

    public AccountService accountService;
    @Autowired
    public AccountTransactionController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("transfer")
    public ResponseEntity<String> transfer(@RequestBody TransferDto transferDto) {
        return ResponseEntity.ok(accountService.transfer(transferDto));
    }

    @PostMapping("deposit")
    public ResponseEntity<String> deposit(@RequestBody DepositDto depositDto) {
        return ResponseEntity.ok(accountService.deposit(depositDto));
    }

    @PostMapping("withdraw")
    public ResponseEntity<String> withdraw(@RequestBody WithdrawDto withdrawDto) {
        return ResponseEntity.ok(accountService.withdraw(withdrawDto));
    }

}
