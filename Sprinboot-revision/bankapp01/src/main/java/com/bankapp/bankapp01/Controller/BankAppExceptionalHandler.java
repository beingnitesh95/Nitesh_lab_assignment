package com.bankapp.bankapp01.Controller;

import com.bankapp.bankapp01.dto.ErrorResposneDto;
import com.bankapp.bankapp01.exception.BankAccountNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class BankAppExceptionalHandler {

    @ExceptionHandler(BankAccountNotFound.class)
    public ResponseEntity<ErrorResposneDto> handleBankAccountNotFound(BankAccountNotFound ex) {

        ErrorResposneDto errorResposneDto = ErrorResposneDto.builder()
                .timeStamp(String.valueOf(LocalDateTime.now()))
                .errorCode(HttpStatus.NOT_FOUND.toString())
                .errorMessge(ex.getMessage())
                .toContact("nitesh@gmail.com").build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResposneDto);
 }
}
