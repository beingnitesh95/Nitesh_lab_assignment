package com.bankapp.bankapp01.service;

import com.bankapp.bankapp01.dto.AccountDto;
import com.bankapp.bankapp01.dto.DepositDto;
import com.bankapp.bankapp01.dto.TransferDto;
import com.bankapp.bankapp01.dto.WithdrawDto;
import com.bankapp.bankapp01.entities.Account;
import com.bankapp.bankapp01.exception.BankAccountNotFound;
import com.bankapp.bankapp01.exception.NotSufficientFundException;
import com.bankapp.bankapp01.repo.AccountRepo;
import com.bankapp.bankapp01.utils.ConverterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional

public class AccountServiceImpl implements AccountService {

    private  AccountRepo accountRepo;
    private Environment environment;

    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo, Environment environment) {
        this.accountRepo = accountRepo;
        this.environment = environment;
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<AccountDto> accountDtos = accountRepo.findAll()
                .stream()
                .map(ConverterUtils::convertToAccountDto).toList();
        return accountDtos;
    }

    @Override
    public AccountDto getAccount(int id) {
        return accountRepo.findById(id)
                .map(ConverterUtils::convertToAccountDto)
                .orElseThrow(() -> new BankAccountNotFound("Account not found"));
    }

    @Override
    public String transfer(TransferDto transferDto) {
        Account fromAccount = ConverterUtils.convertToAccount(getAccount(transferDto.getFromAccountId()));
        Account toAccount = ConverterUtils.convertToAccount(getAccount(transferDto.getToAccountId()));

        fromAccount.setBalance(fromAccount.getBalance().subtract(transferDto.getAmount()));
        BigDecimal value = fromAccount.getBalance();
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotSufficientFundException("insufficient balance");
        }
        toAccount.setBalance(toAccount.getBalance().add(transferDto.getAmount()));
        accountRepo.save(fromAccount);
        accountRepo.save(toAccount);
        return environment.getProperty("transfer.message.success");

    }

    @Override
    public String deposit(DepositDto depositDto) {
        Account account = ConverterUtils.convertToAccount(getAccount(depositDto.getAccountId()));
        account.setBalance(account.getBalance().add(depositDto.getAmount()));
        accountRepo.save(account);
        return "Deposit successful";
    }

    @Override
    public String withdraw(WithdrawDto withdrawDto) {
        Account temp=ConverterUtils.convertToAccount(getAccount(withdrawDto.getAccountId()));
        temp.setBalance(temp.getBalance().subtract(withdrawDto.getAmount()));
        BigDecimal tempBalance=temp.getBalance();

        if(tempBalance.compareTo(BigDecimal.ZERO)<0){
            throw new NotSufficientFundException("insufficient balance");
        }
        accountRepo.save(temp);
        return "withdraw done successfully";
    }

}
