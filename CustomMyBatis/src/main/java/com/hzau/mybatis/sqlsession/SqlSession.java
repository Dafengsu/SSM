package com.hzau.mybatis.sqlsession;

/**
 * @author su
 * @description     和数据库交换的核心类
 * @date 2020/2/28
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     *
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();

}
