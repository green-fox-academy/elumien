package com.greenfoxacademy.dependencies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurpleColor implements MyColor {

    @Autowired
    Printer printer;

    public void printColor(){
        printer.log("It is purple in color...");
    }
}
