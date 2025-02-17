package com.dockerdemo.dockerhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping(path = "employee")
    public Employee getEmployee() {
        return new Employee("John", "Doe", 5000);
    }
}
