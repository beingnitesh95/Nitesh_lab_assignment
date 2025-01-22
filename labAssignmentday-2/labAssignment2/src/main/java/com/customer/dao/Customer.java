package com.customer.dao;

public class Customer {

    private int id;
    private String name;
    private String address;


    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String toString() {
        return "CustomerDTO [id=" + id + "," +
                " name=" + name + "," +
                " address=" + address + "," +
                 "]";
    }
}
