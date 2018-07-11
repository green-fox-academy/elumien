package com.greenfoxacademy.bankofsimba.model;

import javax.persistence.Entity;

@Entity
public class BankAccount {

    String name;
    String animalType;
    int balance;

    public BankAccount() {
    }


    public BankAccount(String name, String animalType, int balance) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
