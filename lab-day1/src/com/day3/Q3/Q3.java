package com.day3.Q3;

import java.io.*;

// Address class
class Address implements Serializable {
    String street;
    String city;
    String state;
    String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}

// Employee class
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient double salary;  // salary will not be serialized
    Address address;

    // Constructor
    public Employee(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);  // Salary will be 0 if not deserialized
        System.out.println("Employee Address: " + address);
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "Cityville", "StateX", "12345");

        // Create an Employee object
        Employee employee = new Employee(1, "John Doe", 50000, address);

        // Serialize the employee object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(employee);
            System.out.println("Employee object serialized.");
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the employee object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmployee = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee object:");
            deserializedEmployee.display();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}

