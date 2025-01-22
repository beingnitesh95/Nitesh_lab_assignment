package com.customer.service;

import com.customer.dao.Customer;
import com.customer.dao.CustomerRepo;
import com.customer.dao.impl.CustomerRepoJdbcImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerDetailRepoImpl implements CustomerDetailRepo {

private CustomerRepo customerRepo=new CustomerRepoJdbcImpl();

    public CustomerDetailRepoImpl() throws SQLException {
    }

    @Override
    public Customer findById(int id) {
        return customerRepo.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

}
