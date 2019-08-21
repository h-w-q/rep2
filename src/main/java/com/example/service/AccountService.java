package com.example.service;

import com.example.domain.Account;

import java.util.List;

public interface AccountService {
    void add(Account account);
    Account delete(Integer id);
    Account findOne(Integer id);
    List<Account> findAll();
}
