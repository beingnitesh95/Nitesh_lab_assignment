package com.labassignment1.dependencyInjection.service;

import com.labassignment1.dependencyInjection.dao.Employee;
import com.labassignment1.dependencyInjection.dao.EmployeeDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao;


    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return dao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        dao.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        dao.updateEmployee(id, employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return dao.getEmployeeById(id);
    }
}
