package com.hzau.dao;

import com.hzau.domain.Role;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/3
 */
public interface RoleDao {
    List<Role> findAll();
}
