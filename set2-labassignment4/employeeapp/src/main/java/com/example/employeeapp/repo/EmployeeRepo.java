package com.example.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
//
//    public List<Employee> findAll();
//    public Employee findById(int id);
//    public Employee findByName(String name);
//    public Employee findByEmail(String email);
}
