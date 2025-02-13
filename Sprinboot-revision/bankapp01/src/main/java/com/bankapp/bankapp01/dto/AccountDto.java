package com.bankapp.bankapp01.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountDto {

   private int id;

   @NotEmpty(message = "name should not be empty")
    private String name;
   @NotEmpty(message = "balance should not be null")
   @Range(min = 0, max=10000, message = "balance should not be negative")
    private BigDecimal balance;

    public AccountDto(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

}
