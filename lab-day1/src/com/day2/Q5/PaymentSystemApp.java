package com.day2.Q5;

public class PaymentSystemApp {
    public static void main(String[] args) {
        // Create instances of Employee and Invoice classes
        Employee emp1 = new Employee("Nitesh", 12000.50);
        Employee emp2 = new Employee("Rahul", 15000.75);

        Invoice inv1 = new Invoice("INV001", 250.00);
        Invoice inv2 = new Invoice("INV002", 450.50);

        // Call getPayment() method for each object
        System.out.println("Employee and Invoice Payments:\n");

        System.out.println("Employee 1 Payment:");
        emp1.getPayment();
        System.out.println();

        System.out.println("Employee 2 Payment:");
        emp2.getPayment();
        System.out.println();

        System.out.println("Invoice 1 Payment:");
        inv1.getPayment();
        System.out.println();

        System.out.println("Invoice 2 Payment:");
        inv2.getPayment();
    }
}
