package com.day2.Q5;

public class Employee implements Payable{

        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public void getPayment() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: $" + salary);
        }
    }
