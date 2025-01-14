package com.day2.Q2;
/*
    Create a book store application which will help a book store to keep the record of its books. For
each book, the application will have the Book Title, Book Author, Book ISBN along with the
number of copies for each book. The system will allow you to display all books, order new/existing
books and sell books. With sell or order of existing books, number of copies will decrease/increase.
With order of new book, a new book entry will be added to the system.
 */
public class Book {

    private String bookTitle;
    private String author;
    private String ISBN;
    private int numberOfCopies;
    public Book(String bookTitle, String author, String ISBN, int numberOfCopies){
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
    }
    public  String getBookTitle(){
        return bookTitle;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    void display(){
        System.out.println("bookTitle is: "+bookTitle+ "ISBN is: "+ISBN+ "numberOfCopies is: " + numberOfCopies );
    }

}
