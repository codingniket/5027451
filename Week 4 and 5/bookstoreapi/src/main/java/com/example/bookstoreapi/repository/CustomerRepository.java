package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    List<Customer> findByNameContaining(String name);

    Customer findByEmail(String email);

    List<Customer> findByPhoneNumber(String phoneNumber);
    
}
