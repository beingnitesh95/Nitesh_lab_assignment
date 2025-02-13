package com.bankapp_labexam.bankapp;

import com.bankapp_labexam.bankapp.entities.Account;
import com.bankapp_labexam.bankapp.repo.AccountRepo;
import com.bankapp_labexam.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner {

	@Autowired
	private AccountRepo accountRepo;
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account("Nitesh", new BigDecimal(1000)));
		accountRepo.save(new Account("Rahul", new BigDecimal(2000)));
		System.out.println("*********Added***********");

	}
}
