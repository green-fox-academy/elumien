package com.greenfoxacademy.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class RestController {

    @GetMapping("/doubling")
    public String doubling(){
        return "doubling";
    }
}
