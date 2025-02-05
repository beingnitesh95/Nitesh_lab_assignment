package com.assignment5.ProductStore.service;

import com.assignment5.ProductStore.entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product findByName(String name);
    public Product getProductById(int id);
    public Product addProduct(Product product);
    Product updateProduct(int id, Product product);
    public void deleteProduct(int id);

    List<Product>getAllProductSorted(String field);
    List<Product>getAllProductPaged(int page, int size);
    List<Product>getAllProductSortedPaged(String field, int page, int size);
}
