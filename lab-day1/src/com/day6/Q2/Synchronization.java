package com.day6.Q2;

public class Synchronization {
    public static void main(String[] args) {
        // Creating an account object with an initial balance of Rs 50,000
        Account account = new Account(50000);

        // Creating bank and company threads
        Thread bankThread = new Thread(new Bank(account), "Bank");
        Thread companyThread = new Thread(new Company(account), "Company");

        // Starting both threads
        bankThread.start();
        companyThread.start();

        // Wait for both threads to finish execution
        try {
            bankThread.join();
            companyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance after all transactions
        System.out.println("Final account balance: " + account.getBalance());
    }
}
