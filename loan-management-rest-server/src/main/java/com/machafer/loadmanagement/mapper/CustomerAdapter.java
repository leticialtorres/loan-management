package com.machafer.loadmanagement.mapper;

import com.machafer.loadmanagement.controller.CustomerRequest;
import com.machafer.loadmanagement.controller.CustomerResponse;
import com.machafer.loadmanagement.model.Customer;

public interface CustomerAdapter {

    Customer customerRequestToCustomer(CustomerRequest customerRequest);

    CustomerResponse customerToCustomerResponse(Customer customer);

    Iterable<CustomerResponse> customersToCustomersResponse(Iterable<Customer> customers);

}
