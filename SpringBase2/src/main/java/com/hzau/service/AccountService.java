package com.hzau.service;

import com.hzau.domain.Account;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/6
 */
public interface AccountService {
    /**
     * 保存账户
     */
    void saveAccount(Account account);

    /**
     * 查询所有
     *
     * @return
     */
    List<Account> findAllAccount();


    /**
     *  查询一个
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);
}
