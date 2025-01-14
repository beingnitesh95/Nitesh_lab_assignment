package com.day2.Q4;
import java.util.*;

class EmployeeRecordSystem {
    private List<Employee> employees;

    public EmployeeRecordSystem() {
        employees = new ArrayList<>();
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to calculate and display weekly salaries of all employees
    public void displaySalaries() {
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }

    // Method to increase salary for all employees by a percentage
    public void increaseSalariesByPercentage(double percentage) {
        for (Employee employee : employees) {
            employee.increaseSalary(percentage);
        }
    }

    // Method to search and display employee by ID
    public void displayEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.displayEmployeeDetails();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
