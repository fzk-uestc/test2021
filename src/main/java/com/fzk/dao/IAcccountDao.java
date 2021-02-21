package com.fzk.dao;

import com.fzk.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fzkstart
 * @create 2021-01-26 15:13
 * 账户dao接口
 */
@Repository(value="accountDao")
public interface IAcccountDao {
    //查询所有
    @Select("select * from account")
    List<Account> findAll();
    //保存账户信息
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
