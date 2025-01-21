package com.example.enocajava.service;

import com.example.enocajava.entity.Customer;
import com.example.enocajava.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
}