package com.hzau.dao;

import com.hzau.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/3/3
 */
public class RoleDaoTest {
    private InputStream in;
    private SqlSession session;
    private RoleDao roleDao;

    @Before
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        roleDao = session.getMapper(RoleDao.class);

    }

    @After
    public void destroy() throws IOException {
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }


    @Test
    public void findAll() {
        List<Role> roles = roleDao.findAll();
        for (Role role : roles) {
            System.err.println(role);
            System.err.println(role.getUsers());
        }
    }
}
