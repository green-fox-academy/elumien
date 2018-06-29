package com.greenfoxacademy.dependencies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

@RequestMapping("/useful")
public String renderUsefulPage() {
    return "useful";
}

@RequestMapping("/useful/colored")
public String renderUsefulColoredPage() {
        return "colored";
    }


}
