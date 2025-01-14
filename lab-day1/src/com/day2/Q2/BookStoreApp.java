package com.day2.Q2;
import java.util.Scanner;


public class BookStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the BookStore object
        BookStore bookStore = new BookStore();

        // Adding some initial books
        bookStore.order("Half Girlfriend", 10);
        bookStore.order("The Heist", 3);
        bookStore.order("Harry Porter", 8);

        // Main loop for user interaction
        while (true) {
            System.out.println("\n---- Bookstore Application ----");
            System.out.println("1. Display all books");
            System.out.println("2. Sell a book");
            System.out.println("3. Order a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Display all books
                    bookStore.display();
                    break;
                case 2:
                    // Sell a book
                    System.out.print("Enter book title to sell: ");
                    String sellTitle = scanner.nextLine();
                    System.out.print("Enter number of copies to sell: ");
                    int sellQuantity = scanner.nextInt();
                    bookStore.sell(sellTitle, sellQuantity);
                    break;
                case 3:
                    // Order a book
                    System.out.print("Enter book ISBN to order: ");
                    String orderIsbn = scanner.nextLine();
                    System.out.print("Enter number of copies to order: ");
                    int orderQuantity = scanner.nextInt();
                    bookStore.order(orderIsbn, orderQuantity);
                    break;
                case 4:
                    System.out.println("Exiting the Bookstore application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

