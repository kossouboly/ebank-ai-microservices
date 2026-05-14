package com.tedjidev.ebankservice.repository;

import com.tedjidev.ebankservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BanKAccountRepository extends JpaRepository<BankAccount,String> {

    List<BankAccount> findByCustomerId(Long id);
}
