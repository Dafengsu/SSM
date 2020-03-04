package com.hzau.dao;

import com.hzau.domain.Account;
import com.hzau.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/5
 */
public interface UserDao2 {
    @Select("SELECT * FROM user")
    @Results(id = "userMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "address", column = "address"),
            @Result(property = "accounts", column = "id", many = @Many(select = "com.hzau.dao.UserDao2.findAccountByUid", fetchType = FetchType.LAZY))
    })
    List<User> findAll();

    @Select("SELECT * FROM account WHERE UID = #{uid}")
    List<Account> findAccountByUid(Integer uid);
}
