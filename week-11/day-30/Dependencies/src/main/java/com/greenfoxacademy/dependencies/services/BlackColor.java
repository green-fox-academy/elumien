package com.greenfoxacademy.dependencies.services;

import org.springframework.beans.factory.annotation.Autowired;

public class BlackColor implements MyColor {

    @Autowired
    Printer printer;

    public void printColor(){
        System.out.println("It is black in color...");
    }
}
