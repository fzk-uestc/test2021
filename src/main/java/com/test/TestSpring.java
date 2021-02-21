package com.test;

import com.fzk.domain.Account;
import com.fzk.service.IAccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzkstart
 * @create 2021-01-26 15:33
 */
public class TestSpring {
    @Test
    public void test1(){
        //1.加载配置文件，获取IOC容器
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.获取bean对象
        IAccountService accountService = context.getBean("accountService", IAccountService.class);

        //3.调用方法
        accountService.findAll();
        accountService.saveAccount(new Account());

        System.out.println("测试git");
        System.out.println("测试git2");
    }
}
