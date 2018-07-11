package com.greenfoxacademy.bankofsimba.service;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    public BankAccount createSimbaAccount() {
        return new BankAccount("Simba", "lion", 2000);
    }

}
