package com.day2.Q1;

public class Q1Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Q1Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId(int id){
        return id;
    }
    public String getFirstName(){
        return lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public  String getName(){
        String name = firstName + lastName;
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int setSalary(int salary){
        return this.salary = salary;
    }
    public int getAnnualSalary(){
        int toatalSalary = salary * 12;
        return toatalSalary;
    }
    public int raiseSalary(int percentage){
        double raiseAmount = salary * percentage/100;
        return this.salary += raiseAmount;
    }

    public String toString(){
        return "\n Employee Id is: " + id +
                "\n Fistname is :" + firstName +
                "\n Lastname is :" + lastName +
                "\n Salary is : " + salary;
    }
}
