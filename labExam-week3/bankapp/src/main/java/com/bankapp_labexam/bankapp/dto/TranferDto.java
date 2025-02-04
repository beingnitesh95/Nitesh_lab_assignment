package com.bankapp_labexam.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TranferDto {
    private int fromAccount;
    private int toAccount;
    private BigDecimal amount;
}
