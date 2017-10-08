package com.machafer.loadmanagement.mapper;

import com.machafer.loadmanagement.controller.CustomerRequest;
import com.machafer.loadmanagement.controller.CustomerResponse;
import com.machafer.loadmanagement.model.Customer;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CustomerAdapterImpl implements CustomerAdapter {

    @Override
    public Customer customerRequestToCustomer(CustomerRequest customerRequest) {

        if (customerRequest == null) {

            return null;
        }

        Customer customer = new Customer();

        customer.setName(customerRequest.getName());

        if (customerRequest.getLimit() != null) {

            customer.setLimit(new BigDecimal(customerRequest.getLimit()));
        }

        if(customerRequest.getRiskType() != null) {

            customer.setRiskType(customerRequest.getRiskType());

            customer.setInterestRate(customerRequest.getRiskType().getInterestRate());

        }

        return customer;
    }

    @Override
    public CustomerResponse customerToCustomerResponse(Customer customer) {

        if(customer == null) {

            return null;
        }

        CustomerResponse customerResponse = new CustomerResponse();

        if(customer.getId() != null) {

            customerResponse.setId( String.valueOf(customer.getId() ) );
        }

        customerResponse.setName(customer.getName() );

        if(customer.getLimit() != null) {

            customerResponse.setLimit(customer.getLimit());
        }

        if(customer.getRiskType() != null) {

            customerResponse.setRiskType(customer.getRiskType().name());
            
        }

        if(customer.getInterestRate() != null) {

            customerResponse.setInterestRate(customer.getInterestRate());
        }

        return customerResponse;
    }    
}

