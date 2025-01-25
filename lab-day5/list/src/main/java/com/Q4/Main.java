package com.Q4;

import java.util.PriorityQueue;

public class Main {

        public static void main(String[] args) {
            // Create 5 products
            Product product1 = new Product(101, "Laptop", 1200.50);
            Product product2 = new Product(102, "Smartphone", 800.75);
            Product product3 = new Product(103, "Headphones", 150.30);
            Product product4 = new Product(104, "Keyboard", 45.99);
            Product product5 = new Product(105, "Mouse", 25.99);

            // Create a PriorityQueue with custom comparator to sort by product price
            PriorityQueue<Product> productQueue = new PriorityQueue<>(new ProductPriceComparator());

            // Add products to the PriorityQueue
            productQueue.add(product1);
            productQueue.add(product2);
            productQueue.add(product3);
            productQueue.add(product4);
            productQueue.add(product5);

            // Display the products in order of priority (lowest price first)
            System.out.println("Products in order of priority (lowest price first):");
            while (!productQueue.isEmpty()) {
                System.out.println(productQueue.poll());
            }
        }
    }

