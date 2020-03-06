package com.hzau.service.impl;

import com.hzau.service.AccountService;

import java.util.Date;

/**
 * @author su
 * @description 账户的业务层实现类
 * @date 2020/3/5
 */
public class AccountServiceImpl2 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
//        accountDao.saveAccount();
        System.out.println("service中的saveAccount方法执行了。。。。"
                + name + "," + age + "," + birthday);
    }


}
