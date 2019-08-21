package com.example.service;

import com.example.dao.AccountDao;
import com.example.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public void add(Account account) {
        accountDao.add(account);
    }

    @Override
    public Account delete(Integer id) {
        Account one = accountDao.findOne(id);
        accountDao.delete(id);
        return one;
    }

    @Override
    public Account findOne(Integer id) {
        return accountDao.findOne(id);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
