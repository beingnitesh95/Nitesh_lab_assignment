package com.productapp.service;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;


    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product save(Product book) {
        return null;
    }

    @Override
    public Product update(String id, Product book) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Product getById(String id) {
        return productRepo.findById(id).get();
    }
}
