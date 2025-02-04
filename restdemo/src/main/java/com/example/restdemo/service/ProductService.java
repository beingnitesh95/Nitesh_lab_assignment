package com.example.restdemo.service;

import com.example.restdemo.repo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
        public List<Product> getProducts();
        Product getProductById(int id);

    Product addProduct(Product product);

}

