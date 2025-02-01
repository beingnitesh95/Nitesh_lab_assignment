package com.example.employeeapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jdk.jfr.Name;
import lombok.*;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private long phone;

//    private int id;
//    @NotEmpty(message = "Name should not be empty")
//    @Column(name = "employee_name")
//    private String name;
//
//    @NotEmpty(message = "Email should not be empty")
//    @Column(name = "employee_email")
//    private String email;
//
//    @NotEmpty(message = "Phone should not be empty")
//    @Range(min = 10, max = 100, message = "Phone should be 10 digits")
//    @Column(name = "employee_phone")
//    private int phone;

    public Employee( String name, String email, long phone) {
        //this.id = id;
        this.name = name;
        this.email = email;
        this.phone = (int) phone;
    }


}
