package com.hzau.dao;

import com.hzau.domain.User;
import com.hzau.mybatis.annotations.Select;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/2/28
 */
public interface UserDao {
    /**
     * 查询所有操作
     * @return
     */
    @Select("SELECT * from user")
    List<User> findAll();
}
