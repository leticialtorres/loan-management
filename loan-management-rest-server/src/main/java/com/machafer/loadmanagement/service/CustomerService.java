package com.machafer.loadmanagement.service;

import com.machafer.loadmanagement.model.Customer;

public interface CustomerService {

    Customer create (Customer customer);

    Iterable<Customer> getAll();
}
