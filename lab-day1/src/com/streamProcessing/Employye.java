package com.streamProcessing;

public class Employye {
    private int id;
    private String name;
    private long salary;

    public Employye(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}