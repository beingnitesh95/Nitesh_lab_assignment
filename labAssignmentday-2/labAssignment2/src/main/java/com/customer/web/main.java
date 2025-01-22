package com.customer.web;

import com.customer.dao.Customer;
import com.customer.dao.CustomerRepo;
import com.customer.service.CustomerDetailRepo;
import com.customer.service.CustomerDetailRepoImpl;

import java.sql.SQLException;
import java.util.List;

public class main {
    public static void main(String[] args) throws SQLException {


        CustomerDetailRepoImpl customerDetail = new CustomerDetailRepoImpl();
        System.out.println("-------------find by id---------");
        Customer customer = customerDetail.findById(2);
        System.out.println(customer);

        System.out.println("-------------Insert into db---------");
        customerDetail.save(new Customer(8,"Rakesh","12 street gorgiea"));
        System.out.println(customerDetail.findById(6));
    }




}