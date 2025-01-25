package com.labexam1.Q1;

public class Merchandise {
        private String itemCode;
        private int quantity;
        private double unitPrice;

        // Constructor
        public Merchandise(String itemCode, int quantity, double unitPrice) {
            this.itemCode = itemCode;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        // Getters
        public String getItemCode() {
            return itemCode;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        // Override toString for easy printing
        @Override
        public String toString() {
            return itemCode + " " + quantity + " " + unitPrice;
        }
    }

