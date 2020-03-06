package com.hzau.service;

import config.SpringConfiguration;
import com.hzau.domain.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/6
 */
public class AccountServiceTest {
    private AccountService accountService;
    @Before
    public void init() {
        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        accountService = (AccountService) ac.getBean("accountService");
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(8888F);
        accountService.saveAccount(account);
    }

    @Test
    public void findAllAccount() {
        List<Account> accounts = accountService.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void findAccountById() {
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void updateAccount() {
//        Account account = accountService.findAccountById(4);
//        account.setName("update");
//        accountService.updateAccount(account);
    }

    @Test
    public void deleteAccount() {
//        accountService.deleteAccount(4);
    }
}
