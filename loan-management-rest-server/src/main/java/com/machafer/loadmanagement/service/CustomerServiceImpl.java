package com.machafer.loadmanagement.service;


import com.machafer.loadmanagement.model.Customer;
import com.machafer.loadmanagement.repository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRespository customerRespository;

    @Autowired
    public CustomerServiceImpl(CustomerRespository customerRespository){
        this.customerRespository = customerRespository;
    }

    @Override
    public Customer create(Customer customer) {
        return customerRespository.save(customer);
    }
}
