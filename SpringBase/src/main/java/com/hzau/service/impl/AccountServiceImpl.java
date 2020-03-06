package com.hzau.service.impl;

import com.hzau.dao.AccountDao;
import com.hzau.dao.impl.AccountDaoImpl;
import com.hzau.factory.BeanFactory;
import com.hzau.factory.InstanceFactory;
import com.hzau.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;

/**
 * @author su
 * @description 账户的业务层实现类
 * @date 2020/3/5
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao2")
    private AccountDao accountDao;
//    private AccountDao accountDao = new AccountDaoImpl();
//    private String name;
//    private Integer age;
//    private Date birthday;
//
//    public AccountServiceImpl(String name, Integer age, Date birthday) {
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//    }


//    public AccountServiceImpl() {
//        System.out.println("对象创建了");
//    }

    @Override
    public void saveAccount() {
//        accountDao.saveAccount();
//        System.out.println("service中的saveAccount方法执行了。。。。"
//                + name + "," + age + "," + birthday);
//        System.out.println("service中的saveAccount方法执行了。。。。");
        accountDao.saveAccount();
    }
    @PostConstruct
    public void init() {
        System.out.println("对象初始化了");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("对象销毁了");
    }
}
