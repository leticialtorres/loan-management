package com.machafer.loadmanagement.repository;

import com.machafer.loadmanagement.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends CrudRepository<Customer,Long> {
}
