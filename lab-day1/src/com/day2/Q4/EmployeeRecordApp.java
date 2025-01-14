package com.day2.Q4;

public class EmployeeRecordApp {

        public static void main(String[] args) {
            EmployeeRecordSystem recordSystem = new EmployeeRecordSystem();

            // Adding employees
            recordSystem.addEmployee(new SalariedEmployee("Nitesh", 1001, 5000.0));
            recordSystem.addEmployee(new HourlyEmployee("Ajit", 1002, 20.0, 40));
            recordSystem.addEmployee(new CommissionEmployee("Rahul", 1003, 5000.0, 10));

            System.out.println("Displaying salaries of all employees:");
            recordSystem.displaySalaries();

            System.out.println("\nIncreasing salaries by 10%...");
            recordSystem.increaseSalariesByPercentage(10);
            recordSystem.displaySalaries();

            System.out.println("\nSearching for employee with ID 102:");
            recordSystem.displayEmployeeById(102);
        }
    }

