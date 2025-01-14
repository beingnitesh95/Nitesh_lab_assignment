package com.day3.Q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class BookApp {

        // LinkedList to hold the books
        private LinkedList<Book> books = new LinkedList<>();

        // Method to read the book data from file and populate LinkedList
        public void loadBooksFromFile(String filename) {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nitesh.Yadav\\Desktop\\files\\book.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Split the line by ':'
                    String[] data = line.split(":");
                    if (data.length == 5) {
                        int id = Integer.parseInt(data[0]);
                        String isbn = data[1];
                        String title = data[2];
                        String author = data[3];
                        double price = Double.parseDouble(data[4]);
                        // Initial stock set to 10 for each book
                        books.add(new Book(id, isbn, title, author, price, 10));
                    }
                }
                System.out.println("Books loaded successfully.");
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }

        // Method to search for a book by ID
        public Book searchBook(int bookId) {
            for (Book book : books) {
                if (book.getId() == bookId) {
                    return book;
                }
            }
            return null;
        }

        // Method to sell a book (reduce stock by number of copies sold)
        public void sellBook(String isbn, int noOfCopies) throws NsbookException {
            Book book = findBookByIsbn(isbn);
            if (book != null) {
                if (book.getStock() >= noOfCopies) {
                    book.setStock(book.getStock() - noOfCopies);
                    System.out.println("Sold " + noOfCopies + " copies of " + book.getTitle());
                } else {
                    throw new NsbookException("Not enough copies of " + book.getTitle() + " available.");
                }
            } else {
                System.err.println("Book not found.");
            }
        }

        // Method to purchase a book (increase stock by number of copies purchased)
        public void purchaseBook(String isbn, int noOfCopies) {
            Book book = findBookByIsbn(isbn);
            if (book != null) {
                book.setStock(book.getStock() + noOfCopies);
                System.out.println("Purchased " + noOfCopies + " copies of " + book.getTitle());
            } else {
                System.err.println("Book not found.");
            }
        }

        // Helper method to find book by ISBN
        private Book findBookByIsbn(String isbn) {
            for (Book book : books) {
                if (book.getIsbn().equals(isbn)) {
                    return book;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            BookApp app = new BookApp();

            // Load books from file
            app.loadBooksFromFile("books.txt");

            // Search for a book by ID
            Book book = app.searchBook(121);
            if (book != null) {
                System.out.println("Found book: " + book);
            } else {
                System.out.println("Book not found.");
            }

            // Sell books
            try {
                app.sellBook("A234", 5); // Sell 5 copies of the book with ISBN A234
            } catch (NsbookException e) {
                System.err.println(e.getMessage());
            }

            // Purchase books
            app.purchaseBook("A234", 3); // Purchase 3 more copies of the book with ISBN A234
        }
    }

