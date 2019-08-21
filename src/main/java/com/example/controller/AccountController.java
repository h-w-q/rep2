package com.example.controller;

import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/add")
    public String add(){
        Account account = new Account("dsds", "中国银行");
        accountService.add(account);
        return "show";
    }

    @RequestMapping("/dele/{id}")
    public String dele(@PathVariable("id") String id){
        Account account = accountService.delete(Integer.parseInt(id));
        return "show";
    }

    @RequestMapping("/findOne")
    public String findOne(String id, Model model){
        Account account = accountService.findOne(Integer.parseInt(id));
        model.addAttribute("account",account);
        return "show";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "show";
    }

    @RequestMapping("/findAll2")
    public String findAll2(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "show";
    }
}
