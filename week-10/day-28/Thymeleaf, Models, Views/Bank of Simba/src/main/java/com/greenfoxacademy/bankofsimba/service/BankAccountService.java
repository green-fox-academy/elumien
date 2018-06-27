package com.greenfoxacademy.bankofsimba.service;

import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    public void createSimba() {
        add(new BankAccount("Simba", 2000.0, "LION"));
        add(new BankAccount("Zebra", 200000.0, "ZEBRA"));
        add(new BankAccount("Zebra", 200000.0, "ZEBRA"));
        add(new BankAccount("Zebra", 200000.0, "ZEBRA"));
        add(new BankAccount("Zebra", 200000.0, "ZEBRA"));
        add(new BankAccount("Zebra", 200000.0, "ZEBRA"));
    }

}
