package com.bankapp.dao.impl;

import java.util.List;

public interface AccountDao {

    public Account getAccountById(int id);
    public List<Account> getAllAccount();
    public void updateAccount(Account account);
}
