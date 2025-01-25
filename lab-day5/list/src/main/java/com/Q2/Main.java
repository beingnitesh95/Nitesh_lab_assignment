package com.Q2;

public class Main {
        public static void main(String[] args) {
            // Create some books
            Book book1 = new Book("Java in Depth", "Nitesh");
            Book book2 = new Book("Learning Java", "Rahul");
            Book book3 = new Book("Java in Depth", "Chandan"); // Duplicate
            Book book4 = new Book("Advanced Java", "Ajit");

            // Create a BookCollection
            Book[] books = {book1, book2, book3, book4};
            BookCollection myBooks = new BookCollection("Rahul", books);

            // Check if a specific book is in the collection
            Book searchBook = new Book("Java in Depth", "Nitesh");
            if (myBooks.hasBook(searchBook)) {
                System.out.println("You own the book: " + searchBook.getTitle());
            } else {
                System.out.println("You do not own the book: " + searchBook.getTitle());
            }

            // Sort the collection
            myBooks.sort();

            // Output the sorted BookCollection
            System.out.println("\nSorted BookCollection:\n");
            System.out.println(myBooks);
        }
    }

