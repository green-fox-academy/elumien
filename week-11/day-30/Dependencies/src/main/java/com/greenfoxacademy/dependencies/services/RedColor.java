package com.greenfoxacademy.dependencies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {

    @Autowired
    Printer printer;

    public void printColor(){
        printer.log("It is red in color...");
    }
}
