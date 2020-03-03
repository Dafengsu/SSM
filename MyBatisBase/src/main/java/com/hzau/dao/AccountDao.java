package com.hzau.dao;

import com.hzau.domain.Account;
import com.hzau.domain.AccountUser;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/2
 */
public interface AccountDao {
    /**
     * 查询所有账户,同时还要获取当前用户的所属用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 查询所有用户并且带有用户名称
     * @return
     */
    List<AccountUser> findAllAccount();
}
