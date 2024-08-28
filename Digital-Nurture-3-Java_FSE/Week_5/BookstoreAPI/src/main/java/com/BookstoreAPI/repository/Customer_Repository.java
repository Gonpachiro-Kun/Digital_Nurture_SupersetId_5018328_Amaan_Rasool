package com.BookstoreAPI.repository;

import com.BookstoreAPI.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customer_Repository extends JpaRepository<Customer, Long> {
    @Query("select x from Customer x where x.cust_name = ?1")
    List<Customer> findByName(String cust_name);
}