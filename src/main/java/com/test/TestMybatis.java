package com.test;

import com.fzk.dao.IAcccountDao;
import com.fzk.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author fzkstart
 * @create 2021-01-26 18:30
 */
public class TestMybatis {
//    @Test
    public void test1() throws Exception {
        //1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //4.获取Dao代理对象
        IAcccountDao iAcccountDao = sqlSession.getMapper(IAcccountDao.class);
        //5.执行方法
        Account account1 = new Account();
        account1.setName("fzk");
        account1.setMoney(1000.0d);
        iAcccountDao.saveAccount(account1);
        List<Account> accounts = iAcccountDao.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
        //事务提交
        sqlSession.commit();

        //6.释放资源
        inputStream.close();
        sqlSession.close();
    }
}
