package com.bankapp.web;

import com.bankapp.dao.impl.Account;
import com.bankapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.bankapp");
        AccountService accountService = context.getBean(AccountService.class);
        System.out.println("-----------Before Tranfer----------");
        accountService.transfer(1, 2, 1000);
        List<Account> getAllAccount = accountService.getAllAccount();
        for (Account account : getAllAccount) {
            System.out.println(account);
        }
        System.out.println("-----------After Deposit----------");
        accountService.deposit(2, 1000);
        getAllAccount = accountService.getAllAccount();
        for (Account account : getAllAccount) {
            System.out.println(account);
        }


    }
}
