package com.vkstech.elasticsearchdemo.controller;

import com.vkstech.elasticsearchdemo.model.Customer;
import com.vkstech.elasticsearchdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers){
        customerRepository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("findAll")
    public Iterable<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("findByFirstName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName){
        return customerRepository.findByFirstName(firstName);
    }


}
