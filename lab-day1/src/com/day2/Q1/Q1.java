package com.day2.Q1;

public class Q1 {
    public static void main(String[] args) {
        Q1Employee employee =new Q1Employee(1, "Nitesh", "Yadav", 5000);
        System.out.println(employee);
        double incrementedSalary = employee.raiseSalary(50);
        System.out.println(incrementedSalary);

    }
}
