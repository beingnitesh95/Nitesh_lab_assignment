package com.productapp;

import com.productapp.dto.InfoDto;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.math.BigDecimal;

//CommandLineRunner

@SpringBootApplication
@EnableConfigurationProperties(InfoDto.class)
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new Product("laptop", BigDecimal.valueOf(50000.00)));
		productRepo.save(new Product("mobile", BigDecimal.valueOf(8000.00)));
		productRepo.save(new Product("toy", BigDecimal.valueOf(500.00)));
		productRepo.save(new Product("watch", BigDecimal.valueOf(1000.00)));
		System.out.println("-----------added----------------");
	}
}
