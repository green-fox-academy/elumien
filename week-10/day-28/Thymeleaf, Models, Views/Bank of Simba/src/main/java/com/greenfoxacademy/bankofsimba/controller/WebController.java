package com.greenfoxacademy.bankofsimba.controller;


import com.greenfoxacademy.bankofsimba.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    BankAccountService bankAccountService;

    @Autowired
    public WebController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/show")
    public String getAllAccount(Model thymeLeafModel) {

        thymeLeafModel.addAttribute("account", bankAccountService.createSimbaAccount());
        return "account";
    }

}
