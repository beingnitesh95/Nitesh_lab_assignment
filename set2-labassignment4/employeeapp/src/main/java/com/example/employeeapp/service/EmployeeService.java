package com.example.employeeapp.service;

import com.example.employeeapp.repo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployee();
    public Employee getEmployeeById(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(int id, Employee employee);
    public Employee deleteEmployee(int id);

}
