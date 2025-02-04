package com.bankapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class AccountDto {

    private int id;
    private String name;
    private int balance;

    public AccountDto(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
