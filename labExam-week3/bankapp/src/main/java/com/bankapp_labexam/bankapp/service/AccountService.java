package com.bankapp_labexam.bankapp.service;

import com.bankapp_labexam.bankapp.dto.TranferDto;
import com.bankapp_labexam.bankapp.entities.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    public void transfer(int fromAccount, int toAccount, BigDecimal amount);
    public void deposit(int accountId, BigDecimal amount);
    public void withdraw(int accountId, BigDecimal amount);
    public Account finById(int accountId);
    public List<Account> getAll();

}
