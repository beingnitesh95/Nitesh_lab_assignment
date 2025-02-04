package com.example.restdemo.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;
    private String catalog;
    public Product(int id, String name, double price, String catalog) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }


}
