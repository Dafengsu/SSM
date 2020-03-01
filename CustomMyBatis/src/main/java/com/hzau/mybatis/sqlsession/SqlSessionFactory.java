package com.hzau.mybatis.sqlsession;

/**
 * @author su
 * @description
 * @date 2020/2/28
 */
public interface SqlSessionFactory {
    /**
     * 打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
