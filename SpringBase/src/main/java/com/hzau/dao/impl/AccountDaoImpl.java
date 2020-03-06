package com.hzau.dao.impl;

import com.hzau.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author su
 * @description 账户的持久层实现类
 * @date 2020/3/5
 */
@Repository("accountDao1")
public class AccountDaoImpl implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户11111111111");
    }
}
