package com.example.restdemo.repo;

import java.util.List;

public interface ProductRepo {
    public List<Product> getProduct();
    public Product getProductById(int id);

}
