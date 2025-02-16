package com.controller;

import com.repo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate =new TestRestTemplate();

    @Test
    public void getAllEmployees() {
        Employee newEmployee = new Employee("John Doe", "john@abc.com", 70000);
        ResponseEntity<Employee> response = restTemplate.postForEntity("/employees", newEmployee, Employee.class);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody().getId());
    }
}