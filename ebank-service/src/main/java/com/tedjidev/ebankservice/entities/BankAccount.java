package com.tedjidev.ebankservice.entities;


import com.tedjidev.ebankservice.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Date createdAt;
    private Double balance;
    private String type;
    private long customerId;

    @Transient
    private Customer customer;
}
