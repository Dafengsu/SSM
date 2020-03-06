package com.hzau.ui;



import com.hzau.dao.AccountDao;
import com.hzau.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author su
 * @description 模拟一个表现层调用业务层
 * @date 2020/3/5
 */
public class Client {
    /**
     * 获取spring的IOC的核心容器,并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
//        AccountService accountService = new AccountServiceImpl();
//        for (int i = 0; i < 5; i++) {
//            accountService = (AccountService) BeanFactory.getBean("accountService");
//            System.out.println(accountService);
//        }
        //--------------------ApplicationContext--------------------
//        //1.获取核心容器对象
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        AccountService accountService = (AccountService) ac.getBean("accountService");
//        accountService.saveAccount();
//        AccountService accountService2 = (AccountService) ac.getBean("accountService2");
//        accountService2.saveAccount();
//        AccountService accountService3 = (AccountService) ac.getBean("accountService3");
////        accountService3.saveAccount();
//        ac.close();
//        //2.根据id获取bean对象
//        AccountService accountService = (AccountService) ac.getBean("accountService");
//        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
//        System.out.println(accountService);
//        System.out.println(accountDao);
//        accountService.saveAccount();
        //-----------------BeanFactory----------------------
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        AccountService accountService = (AccountService) beanFactory.getBean("accountService");
//        AccountDao accountDao = beanFactory.getBean("accountDao", AccountDao.class);
//        System.out.println(accountService);
//        System.out.println(accountDao);
    }
}
