package com.tedjidev.customerservice.services;


import com.tedjidev.customerservice.entities.Customer;
import com.tedjidev.customerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

private CustomerRepository customerRepository;

public CustomerService(CustomerRepository customerRepository){
    this.customerRepository=customerRepository;

}

    public List<Customer> getAllCustomer(){
       return customerRepository.findAll();
    }

    public Customer findCustomerById(Long id){

      return customerRepository.findById(id)
              .orElseThrow(()->new RuntimeException("Customer Not found"));
    }


    public Customer saveCustomer(Customer customer){
     return customerRepository.save(customer);
    }


}
