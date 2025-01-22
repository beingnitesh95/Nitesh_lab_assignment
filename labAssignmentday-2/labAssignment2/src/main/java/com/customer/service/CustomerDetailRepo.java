package com.customer.service;

import com.customer.dao.Customer;

import java.util.List;

public interface CustomerDetailRepo {
    Customer findById(int id);
    Customer save(Customer customer);
}
