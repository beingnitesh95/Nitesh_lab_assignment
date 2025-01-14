package com.day2.Q2;
/*
    Create a book store application which will help a book store to keep the record of its books. For
each book, the application will have the Book Title, Book Author, Book ISBN along with the
number of copies for each book. The system will allow you to display all books, order new/existing
books and sell books. With sell or order of existing books, number of copies will decrease/increase.
With order of new book, a new book entry will be added to the system.
 */
class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    private int numOfCopies;

    public Book(String bookTitle, String author, String isbn, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.numOfCopies = numOfCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }


    public void display() {
        System.out.println(bookTitle + " - " + author + " - " + isbn + " - " + numOfCopies);
    }

    // Method to decrease number of copies when a book is sold
    public void sell(int quantity) {
        if (quantity <= numOfCopies) {
            numOfCopies -= quantity;
        } else {
            System.out.println("Not enough copies to sell.");
        }
    }

    // Method to increase the number of copies when new books are ordered
    public void order(int quantity) {
        numOfCopies += quantity;
    }
}

