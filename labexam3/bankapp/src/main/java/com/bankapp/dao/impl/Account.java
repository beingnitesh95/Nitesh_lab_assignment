package com.bankapp.dao.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

}
