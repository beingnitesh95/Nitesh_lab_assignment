package com.bankapp_labexam.bankapp.service;

import com.bankapp_labexam.bankapp.entities.Account;
import com.bankapp_labexam.bankapp.exception.AccountNotFoundException;
import com.bankapp_labexam.bankapp.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    public AccountRepo accountRepo;

    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public void transfer(int from, int to, BigDecimal amount) {
        Account fromAccount = finById(from);
        Account toAccount= finById(to);
        fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
        toAccount.setBalance(toAccount.getBalance().add(amount));
        accountRepo.save(fromAccount);
        accountRepo.save(toAccount);

    }

    @Override
    public void deposit(int accountId, BigDecimal amount) {
        Account account = finById(accountId);
        account.setBalance(account.getBalance().add(amount));
        accountRepo.save(account);

    }

    @Override
    public void withdraw(int accountId, BigDecimal amount) {
        Account account = finById(accountId);
        account.setBalance(account.getBalance().subtract(amount));
        accountRepo.save(account);
    }

    @Override
    public Account finById(int accountId) {
        return accountRepo.findById(accountId)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }
}
