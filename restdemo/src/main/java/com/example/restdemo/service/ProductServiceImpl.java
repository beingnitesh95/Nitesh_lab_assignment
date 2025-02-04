package com.example.restdemo.service;

import com.example.restdemo.repo.Product;
import com.example.restdemo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getProducts() {
        return productRepo.getProduct();
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.getProductById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return (Product) productRepo.getProduct();
    }

}
