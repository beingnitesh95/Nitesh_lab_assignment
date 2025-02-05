package com.assignment5.ProductStore.service;

import com.assignment5.ProductStore.entities.Product;
import com.assignment5.ProductStore.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;
    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.getAllProducts();
    }

    @Override
    public Product findByName(String name) {
        return productRepo.findByName(name);
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.getProductById(id);
    }

    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate = getProductById(id);
        productToUpdate.setPrice(product.getPrice());
        productRepo.save(productToUpdate);
        return productToUpdate;

    }

    @Override
    public void deleteProduct(int id) {
        Product productToDelete = getProductById(id);
        productRepo.delete(productToDelete);
    }

    @Override
    public List<Product> getAllProductSorted(String field) {
        return productRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    @Override
    public List<Product> getAllProductPaged(int page, int size) {
        return productRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public List<Product> getAllProductSortedPaged(String field, int page, int size) {
        return productRepo.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, field))).getContent();
    }
}
