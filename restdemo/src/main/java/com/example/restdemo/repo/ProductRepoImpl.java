package com.example.restdemo.repo;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepoImpl implements ProductRepo {

    private static  Map<Integer, Product> productMap=new HashMap<>() ;
    private static int counter;
    static {
        productMap.put(1, new Product(1, "Laptop", 1000, "Electronics"));
        productMap.put(2, new Product(2, "Mobile", 500, "Electronics"));
        productMap.put(3, new Product(3, "TV", 2000, "Electronics"));
        productMap.put(4, new Product(4, "Shirt", 50, "Clothing"));
    }
    public List<Product> getProduct() {
        return new ArrayList<>(productMap.values());
    }

    public Product getProductById(int id) {
        return productMap.get(id);
    }



}
