package com.bankapp.bankapp01.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResposneDto {

    private String errorCode;
    private String errorMessge;
    private String timeStamp;
    private String toContact;
}
