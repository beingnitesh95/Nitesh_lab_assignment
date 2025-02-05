package com.assignment5.ProductStore.repo;

import com.assignment5.ProductStore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query("select p from Product p")
    public List<Product> getAllProducts();

    @Query("select p from Product p where p.name = ?1")
    public Product findByName(String name);

    @Query("select p from Product p where p.id = ?1")
    public Product getProductById(int id);

    @Query("select p from Product p where p.name = ?1 and p.price = ?2")
    public Product findByNameAndPrice(String name, BigDecimal price);



}
