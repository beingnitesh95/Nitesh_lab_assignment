package com.day2.Q4;

// Base class: Employee
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate weekly salary
    public abstract double calculateWeeklySalary();

    // Method to increase salary by a percentage
    public abstract void increaseSalary(double percentage);

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// SalariedEmployee class (fixed weekly salary)
class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, int id, double weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public void increaseSalary(double percentage) {
        this.weeklySalary += (this.weeklySalary * percentage / 100);
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Weekly Salary: $" + calculateWeeklySalary());
    }
}

// HourlyEmployee class (paid per hour)
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateWeeklySalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void increaseSalary(double percentage) {
        this.hourlyRate += (this.hourlyRate * percentage / 100);
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked + ", Weekly Salary: $" + calculateWeeklySalary());
    }
}

// CommissionEmployee class (paid based on sales)
class CommissionEmployee extends Employee {
    private double salesAmount;
    private double commissionRate;

    public CommissionEmployee(String name, int id, double salesAmount, double commissionRate) {
        super(name, id);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateWeeklySalary() {
        return (commissionRate * salesAmount) / 100;
    }

    @Override
    public void increaseSalary(double percentage) {
        this.commissionRate += (this.commissionRate * percentage / 100);
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Sales Amount: $" + salesAmount + ", Commission Rate: " + commissionRate + "%, Weekly Salary: $" + calculateWeeklySalary());
    }
}