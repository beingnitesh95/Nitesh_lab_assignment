package com.example.restdemo.controller;

import com.example.restdemo.repo.Product;
import com.example.restdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //********Get all products*********//
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    //********Get product by id*********//
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    //********Post call for adding product *********//
    @PostMapping("/products/{name}")
    public Product addProduct(Product product) {
        return productService.addProduct(product);
    }


}
