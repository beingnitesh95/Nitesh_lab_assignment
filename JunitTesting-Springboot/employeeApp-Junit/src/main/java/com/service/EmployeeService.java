package com.service;

import com.repo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void save(Employee employee);
    public void deleteEmployeeById(int id);
}
