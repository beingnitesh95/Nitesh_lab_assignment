package com.day2.Q5;

class Invoice implements Payable {
    private String invoiceNumber;
    private double amount;

    public Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    @Override
    public void getPayment() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Invoice Amount: $" + amount);
    }
}
