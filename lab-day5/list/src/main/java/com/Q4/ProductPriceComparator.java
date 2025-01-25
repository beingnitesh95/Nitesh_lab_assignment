package com.Q4;


import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            // Compare by product price (ascending order)
            return Double.compare(p1.getProductPrice(), p2.getProductPrice());
        }
    }

