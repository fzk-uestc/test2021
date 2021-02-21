package com.fzk.service;

import com.fzk.domain.Account;

import java.util.List;

/**
 * @author fzkstart
 * @create 2021-01-26 15:16
 * 账户的service接口
 */
public interface IAccountService {
    //查询所有
    List<Account> findAll();
    //保存账户信息
    void saveAccount(Account account);
}
