package com.hzau.service.impl;

import com.hzau.dao.AccountDao;
import com.hzau.dao.impl.AccountDaoImpl;
import com.hzau.factory.BeanFactory;
import com.hzau.service.AccountService;

/**
 * @author su
 * @description 账户的业务层实现类
 * @date 2020/3/5
 */
public class AccountServiceImpl implements AccountService {
    //    private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");
    private AccountDao accountDao = new AccountDaoImpl();
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
