package com.bankapp.bankapp01.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDto {
    private int fromAccountId;
    private int toAccountId;

    @NotNull(message = "amount should not be null")
    @Range(min = 0, max=10000, message = "amount cannot be out of range")
    private BigDecimal amount;
}
