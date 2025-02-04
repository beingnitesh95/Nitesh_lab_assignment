package com.bankapp.bankapp01.exception;

public class BankAccountNotFound extends RuntimeException{

    public BankAccountNotFound(String message) {
        super(message);
    }

}
