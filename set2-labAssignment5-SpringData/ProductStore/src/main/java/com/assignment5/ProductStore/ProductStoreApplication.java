package com.assignment5.ProductStore;

import com.assignment5.ProductStore.entities.Product;
import com.assignment5.ProductStore.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class ProductStoreApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;


	public static void main(String[] args) {
		SpringApplication.run(ProductStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> products = IntStream.rangeClosed(1, 1000)
				.mapToObj(i->new Product("Product "+i, new BigDecimal(new Random().nextInt(1000)), LocalDate.now()))
				.toList();
		//productRepo.saveAll(products);

	}
}
