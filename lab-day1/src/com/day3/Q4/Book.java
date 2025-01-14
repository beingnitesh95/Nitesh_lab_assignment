package com.day3.Q4;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int stock;  // Track available stock


    public Book(int id, String isbn, String title, String author, double price, int stock) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", isbn='" + isbn + "', title='" + title + "', author='" + author + "', price=" + price + ", stock=" + stock + "}";
    }
}

