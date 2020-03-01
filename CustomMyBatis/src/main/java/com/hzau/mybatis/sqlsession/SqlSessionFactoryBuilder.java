package com.hzau.mybatis.sqlsession;

import com.hzau.mybatis.cfg.Configuration;
import com.hzau.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.hzau.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author su
 * @description
 * @date 2020/2/28
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }

}
