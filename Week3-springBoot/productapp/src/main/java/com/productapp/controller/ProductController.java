package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@ResponseBody: parser in our classpath: jackson parser
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //ResponseEntity: HTTP status code + data

    //get all
    @GetMapping("products")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }

    //get by id
    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProductById(id));
    }

    //add product
    @PostMapping("products")
    public ResponseEntity<Product> addProduct(@RequestBody @Valid Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
    }

    //update product
    @PutMapping("products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id,
                                 @RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, product));
    }

    //remove product
    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> removeProduct(@PathVariable int id) {
        productService.removeProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
