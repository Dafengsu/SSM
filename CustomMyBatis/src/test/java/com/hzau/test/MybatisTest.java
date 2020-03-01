package com.hzau.test;


import com.hzau.dao.UserDao;
import com.hzau.domain.User;
import com.hzau.mybatis.io.Resources;
import com.hzau.mybatis.sqlsession.SqlSession;
import com.hzau.mybatis.sqlsession.SqlSessionFactory;
import com.hzau.mybatis.sqlsession.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/2/28
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {

        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}

