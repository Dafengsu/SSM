package com.hzau.dao;

import com.hzau.domain.QueryVo;
import com.hzau.domain.User;
import org.apache.ibatis.annotations.Select;


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
    /*@Select("SELECT * from user")*/
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户的操作
     * @param userId
     */
    void deleteUser(Integer userId);

    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 模糊查询
     *
     * @param username
     * @return
     */
    List<User> findByName(String username);

    int findTotal();

    /**
     * 根据QueryVo中的查询条件查询vo
     * @param vo
     * @return
     */
    List<User> findUserByVo(QueryVo vo);
}
