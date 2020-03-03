package com.hzau.dao;

import com.hzau.domain.QueryVo;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author su
 * @description
 * @date 2020/2/29
 */
public class UserDaoTest {
    private InputStream in;
    private SqlSession session;
    private UserDao userDao;

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
        userDao = session.getMapper(UserDao.class);

    }

    @After
    public void destroy() throws IOException {
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }


    @Test
    public void findAll() throws IOException {
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.err.println(user);
            System.err.println(user.getAccounts());
        }

    }

    /**
     * 测试保存操作
     */
    @Test
    public void saveUser() throws IOException {
        User user = new User();
        user.setUsername("mybatis lastInsetUser");
        user.setAddress("北京市顺义区");
        user.setSex("男");
        user.setBirthday(new Date());
        //5.使用代理对象执行方法
        userDao.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(70);
        user.setUsername("mybatis updateUser");
        user.setAddress("北京市顺义区");
        user.setSex("男");
        user.setBirthday(new Date());

        userDao.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userDao.deleteUser(48);
    }

    @Test
    public void findById() {
        User user = userDao.findById(70);
        System.out.println(user);
    }

    @Test
    public void findByName() {
        List<User> list = userDao.findByName("%王%");
        list.forEach(System.out::println);
    }

    @Test
    public void findTotal() {
        int total = userDao.findTotal();
        System.err.println("总用户数：" + total);
    }

    @Test
    public void findUserByVO() {
        QueryVo queryVo = new QueryVo();
        User user = new User();
        queryVo.setUser(user);
        user.setUsername("%王%");
        List<User> users = userDao.findUserByVo(queryVo);
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void findByCondition() {
        User user = new User();
//        user.setUsername("老王");
        List<User> users = userDao.findUserByCondition(user);
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void findUserInIds() {
        QueryVo queryVo = new QueryVo();
        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(42);
        queryVo.setIds(list);

        List<User> users = userDao.findUserInIds(queryVo);
        for (User user : users) {
            System.err.println(user);
        }
    }
}
