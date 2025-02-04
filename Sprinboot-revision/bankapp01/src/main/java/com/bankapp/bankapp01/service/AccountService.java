package com.bankapp.bankapp01.service;

import com.bankapp.bankapp01.dto.AccountDto;
import com.bankapp.bankapp01.dto.DepositDto;
import com.bankapp.bankapp01.dto.TransferDto;
import com.bankapp.bankapp01.dto.WithdrawDto;
import com.bankapp.bankapp01.entities.Account;

import java.util.List;

public interface AccountService {
    public List<AccountDto> getAllAccounts();
    public AccountDto getAccount(int id);
    public String transfer(TransferDto transferDto);
    public String deposit(DepositDto depositDto);
    public String withdraw(WithdrawDto withdrawDto);


}
