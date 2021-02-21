package com.fzk.service.impl;

import com.fzk.dao.IAcccountDao;
import com.fzk.domain.Account;
import com.fzk.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fzkstart
 * @create 2021-01-26 15:17
 * 账户的service实现类
 */
@Service(value="accountService")
public class AccountService implements IAccountService {
    @Autowired
    private IAcccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：findAll()。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：saveAccount()...");
        accountDao.saveAccount(account);
    }
}
