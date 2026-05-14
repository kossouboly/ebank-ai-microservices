package com.tedjidev.customerservice.controllers;

import com.tedjidev.customerservice.entities.Customer;
import com.tedjidev.customerservice.services.CustomerService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }


    @GetMapping("/customers/{id}")
    public Customer findCustomerById(@PathVariable Long id){

        return customerService.findCustomerById(id);

    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }



}
