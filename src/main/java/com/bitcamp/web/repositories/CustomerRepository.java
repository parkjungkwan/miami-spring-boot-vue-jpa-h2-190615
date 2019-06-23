package com.bitcamp.web.repositories;

import java.util.List;

import com.bitcamp.web.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> , JpaSpecificationExecutor<Customer>{

    List<Customer> findByCustomerName(String customerName);
}