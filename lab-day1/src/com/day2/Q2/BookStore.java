package com.day2.Q2;

class BookStore {
    private Book[] books;
    private int numBooks;

    // Constructor to initialize the bookstore
    public BookStore() {
        books = new Book[10]; // Assume the maximum number of books is 10
        numBooks = 0;
    }

    public void sell(String bookTitle, int quantity) {
        boolean bookFound = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookTitle().equalsIgnoreCase(bookTitle)) {
                books[i].sell(quantity);
                bookFound = true;
                System.out.println("Sold " + quantity + " copies of " + bookTitle);
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found.");
        }
    }

    // Method to order books
    public void order(String isbn, int quantity) {
        boolean bookFound = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i].order(quantity);
                bookFound = true;
                System.out.println("Ordered " + quantity + " more copies of " + books[i].getBookTitle());
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found. Adding new book to the store.");
            books[numBooks] = new Book("New Book", "New Author", isbn, quantity);
            numBooks++;
            System.out.println("New book added: New Book - New Author - " + isbn + " - " + quantity);
        }
    }

    public void display() {
        if (numBooks == 0) {
            System.out.println("No books available in the store.");
        } else {
            for (int i = 0; i < numBooks; i++) {
                books[i].display();
            }
        }
    }
}
