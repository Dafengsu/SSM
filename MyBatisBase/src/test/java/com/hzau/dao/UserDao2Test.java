package com.hzau.dao;

import com.hzau.domain.User;
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
 * @date 2020/3/5
 */
public class UserDao2Test {
    private InputStream in;
    private SqlSession session;
    private UserDao2 userDao2;

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
        userDao2 = session.getMapper(UserDao2.class);

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
        List<User> users = userDao2.findAll();
        for (User user : users) {
            System.err.println(user);
            System.err.println(user.getAccounts());
        }
    }
}
