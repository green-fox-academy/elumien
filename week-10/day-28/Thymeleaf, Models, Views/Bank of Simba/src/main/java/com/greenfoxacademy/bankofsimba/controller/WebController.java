package com.greenfoxacademy.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/show")
    public String getAllAccount(Model thymeLeafModel) {
        //bankService.createSimba();
        //thymeLeafModel.addAttribute("accounts", bankService.getAllAccount());
        return "accounts";
    }

}
