package com.greenfoxacademy.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.StringBufferInputStream;

@Controller
public class MainController {

    @RequestMapping("/")
    public String openMainPage() {
    return "index";
    }
}
