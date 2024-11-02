package com.learning.web;

import com.learning.services.AccountServiceImpl;
import com.learning.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private  IAccountService accountService;

    public TestController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/message")
    public String message(){
        accountService.createAccount("TST-Username","123123123");
        return "LearningApplication Changed and checked for Reload";
    }
}
