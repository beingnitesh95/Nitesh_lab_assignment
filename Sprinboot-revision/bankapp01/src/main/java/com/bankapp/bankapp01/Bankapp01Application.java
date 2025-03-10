package com.bankapp.bankapp01;

import com.bankapp.bankapp01.entities.Account;
import com.bankapp.bankapp01.repo.AccountRepo;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.math.BigDecimal;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Bankapp01Application implements CommandLineRunner {

	private AccountRepo accountRepo;
	@Autowired
	public Bankapp01Application(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}


	public static void main(String[] args) {
		SpringApplication.run(Bankapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//I have this method to initialize the database
		accountRepo.save(new Account("Nitesh", new BigDecimal("1000.00")));
		accountRepo.save(new Account("Roy", new BigDecimal("2000.00")));
		System.out.println("*******Added***********");
	}
}



