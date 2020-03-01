package com.hzau.mybatis.sqlsession.defaults;

import com.hzau.mybatis.cfg.Configuration;
import com.hzau.mybatis.sqlsession.SqlSession;
import com.hzau.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author su
 * @description SqlSessionFactory的实现类
 * @date 2020/2/29
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的数据库操作对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }

}
