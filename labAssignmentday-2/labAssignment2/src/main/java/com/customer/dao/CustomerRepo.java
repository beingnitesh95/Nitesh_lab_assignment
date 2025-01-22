package com.customer.dao;

import java.util.List;

public interface CustomerRepo {
    Customer findById(int id);
    Customer save(Customer customer);
}
