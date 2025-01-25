package com.labexam1.Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            // Create an ArrayList to store merchandise
            List<Merchandise> inventory = new ArrayList<>();

            // Read from the input file
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\SE\\lab-exam-1\\src\\main\\resources\\Input.data"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\s+"); // Split by spaces
                    String itemCode = parts[0];
                    int quantity = Integer.parseInt(parts[1]);
                    double price = Double.parseDouble(parts[2]);

                    // Create a Merchandise object and add it to the list
                    Merchandise merchandise = new Merchandise(itemCode, quantity, price);
                    inventory.add(merchandise);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Sort the merchandise in ascending order by item code (name)
            inventory.sort(Comparator.comparing(Merchandise::getItemCode));

            System.out.println("Sorted by item code (ascending):");
            for (Merchandise merchandise : inventory) {
                System.out.println(merchandise);
            }

            // Sort the merchandise in descending order by price
            inventory.sort(Comparator.comparingDouble(Merchandise::getUnitPrice).reversed());

            System.out.println("\nSorted by price (descending):");
            for (Merchandise merchandise : inventory) {
                System.out.println(merchandise);
            }
        }
    }

