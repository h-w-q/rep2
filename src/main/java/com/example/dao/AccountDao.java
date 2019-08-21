package com.example.dao;

import com.example.domain.Account;

import java.util.List;

public interface AccountDao {
    void add(Account account);
//    void update(Account account);
    Account findOne(Integer id);
    void delete(Integer id);
    List<Account> findAll();
}
