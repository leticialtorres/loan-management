package com.machafer.loadmanagement.controller;

import com.machafer.loadmanagement.service.CustomerService;
import com.machafer.loadmanagement.mapper.CustomerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;
    private CustomerAdapter customerAdapter;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerAdapter customerAdapter){
        this.customerService = customerService;
        this.customerAdapter = customerAdapter;
    }

    @RequestMapping(value="/customers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<CustomerResponse> create(@RequestBody CustomerRequest customerRequest){

        CustomerResponse customerResponse = customerAdapter.customerToCustomerResponse(customerService.create(customerAdapter.customerRequestToCustomer(customerRequest)));

        return new ResponseEntity(customerResponse, HttpStatus.CREATED);
    }
}
