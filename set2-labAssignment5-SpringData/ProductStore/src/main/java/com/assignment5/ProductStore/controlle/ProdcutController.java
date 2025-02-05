package com.assignment5.ProductStore.controlle;

import com.assignment5.ProductStore.entities.Product;
import com.assignment5.ProductStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdcutController{

    private ProductService productService;
    @Autowired
    public ProdcutController(ProductService productService) {
        this.productService = productService;
    }

    //localhost:8083/productstoreapp/products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products/name/{name}")
    public Product findByName(String name) {
        return productService.findByName(name);
    }

    //http://localhost:8083/productstoreapp/productsorted?field=name
    @GetMapping(path="productsorted")
    public List<Product> getAllProductSorted(@RequestParam(name = "field") String field) {
        return productService.getAllProductSorted(field);
    }

    //http://localhost:8083/productstoreapp/productsortedpage?field=name&page=4&size=100
    @GetMapping(path="productsortedpage")
    public List<Product> getAllProductSortedPage(@RequestParam(name = "field") String field,
                                                 @RequestParam(name = "page") int page,
                                                 @RequestParam(name = "size") int size) {
        return productService.getAllProductSortedPaged(field, page, size);
    }



}
