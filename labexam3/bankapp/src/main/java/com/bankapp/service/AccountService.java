package com.bankapp.service;

import com.bankapp.dao.impl.Account;
import java.util.List;

public interface AccountService {
    public void transfer(int from, int to, int amout);
    public void deposit(int id, double amount);
    public Account getAccountById(int id);
    List<Account> getAllAccount();
}
