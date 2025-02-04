package com.bankapp.service;

import com.bankapp.dao.impl.Account;
import com.bankapp.dao.impl.AccountDao;
import com.bankapp.exception.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public void transfer(int from, int to, int amount) {
        Account fromAccount=accountDao.getAccountById(from);
        Account toAccount=accountDao.getAccountById(to);
        fromAccount.setBalance(fromAccount.getBalance()-amount);
        toAccount.setBalance(toAccount.getBalance()+amount);
        accountDao.updateAccount(fromAccount);
        accountDao.updateAccount(toAccount);
    }

    @Override
    public void deposit(int id, double amount) {
        Account account=accountDao.getAccountById(id);
        account.setBalance((int) (account.getBalance()+amount));
        accountDao.updateAccount(account);
    }

    @Override
    public Account getAccountById(int id) {
        Account account=accountDao.getAccountById(id);
        if(account==null){
            throw new AccountNotFoundException("Account not found");
        }
        return account;
    }

    @Override
    public List<Account> getAllAccount() {
        List<Account> accountList=accountDao.getAllAccount();
        return accountList;
    }
}
