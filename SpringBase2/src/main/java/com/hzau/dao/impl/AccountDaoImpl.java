package com.hzau.dao.impl;

import com.hzau.dao.AccountDao;
import com.hzau.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/6
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private QueryRunner runner;

   /* public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }*/

    @Override
    public void saveAccount(Account account) {
        try {
            runner.update("INSERT INTO account(name, money) VALUES (?,?)",
                    account.getName(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Account> findAllAccount() {
        try {
            return runner.query("SELECT * FROM account", new BeanListHandler<>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        try {
            return runner.query("SELECT * FROM account WHERE id = ?", new BeanHandler<>(Account.class), accountId);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            runner.update("UPDATE account SET name = ?,money = ? WHERE id = ?",
                    account.getName(), account.getMoney(), account.getId());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void deleteAccount(Integer accountId) {
        try {
            runner.update("DELETE from account WHERE id = ?", accountId);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
