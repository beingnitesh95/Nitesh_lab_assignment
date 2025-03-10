package com.bankapp.dao.impl.impl;

import com.bankapp.dao.impl.Account;
import com.bankapp.dao.impl.AccountDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository("jdbcAccountDao")
public class AccountDaoImpl implements AccountDao {

    private Map<Integer, Account> accounts;
    private int counter;
    public AccountDaoImpl(){
        counter=0;
        accounts=new HashMap<>();
        accounts.put(++counter, new Account(1,"Nitesh", 1000));
        accounts.put(++counter, new Account(2, "Rahul", 2000));
    }

    @Override
    public Account getAccountById(int id) {
        return accounts.get(id);
    }

    @Override
    public List<Account> getAllAccount() {
        return new LinkedList<>(accounts.values());
    }

    @Override
    public void updateAccount(Account account) {
        //accounts.put(account.getId(), account);
    }


}
