package com.labassignment1.dependencyInjection1UsingXml.web;

import com.labassignment1.dependencyInjection1UsingXml.dao.Employee;
import com.labassignment1.dependencyInjection1UsingXml.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        // Load Spring context from applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");

        // Retrieve the EmployeeService bean from the context
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        // Display all employees
        System.out.println("All Employees:");
        for (Employee employee : employeeService.getAllEmployees()) {
            System.out.println(employee.getName());
        }

        // Add a new employee
        Employee newEmployee = new Employee(0, "John", "HR", 400000);
        employeeService.addEmployee(newEmployee);
        System.out.println("After Adding New Employee:");
        for (Employee employee : employeeService.getAllEmployees()) {
            System.out.println(employee.getName());
        }

        // Close the Spring context
        context.close();
    }
}
