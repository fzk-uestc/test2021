package com.fzk.controller;

import com.fzk.domain.Account;
import com.fzk.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author fzkstart
 * @create 2021-01-26 15:18
 * 账户的前端控制器
 */
@Controller(value="accountController")
@RequestMapping(path="/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping(path="/findAll")
    public ModelAndView findAll(Model model){
        System.out.println("表现层：findAll...");
        //调用业务层方法
        List<Account> accounts = accountService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",accounts);
        mv.setViewName("list");
        return mv;
    }

    @RequestMapping(path="/saveAccount")
    public String saveAccount(Account account) throws IOException {
        System.out.println("表现层：saveAccount...");
        accountService.saveAccount(account);
        return "redirect:findAll";
    }
}
