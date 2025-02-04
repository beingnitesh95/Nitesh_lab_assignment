package com.example.employeeapp.service;

import com.example.employeeapp.repo.Employee;
import com.example.employeeapp.exceptions.EmployeeNotFoundException;
import com.example.employeeapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
    }

    @Override
    public Employee addEmployee(Employee employee) {
        if(getEmployeeById(employee.getId()) != null) {
            throw new EmployeeNotFoundException("Employee already exists");
        }
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(int id, Employee name) {
        Employee empToUpdate = getEmployeeById(id);
        empToUpdate.setName(name.getName());
        employeeRepo.save(empToUpdate);
        return empToUpdate;
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee empToDelete = getEmployeeById(id);
        employeeRepo.delete(empToDelete);
        return empToDelete;
    }
}
