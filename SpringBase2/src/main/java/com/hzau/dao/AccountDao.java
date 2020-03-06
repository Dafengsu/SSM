package com.hzau.dao;

import com.hzau.domain.Account;

import java.util.List;

/**
 * @author su
 * @description 账户的持久层接口
 * @date 2020/3/6
 */
public interface AccountDao {

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
     * 查询一个
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
