package com.hzau.factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author su
 * @description 创建一个Bean对象的工厂。
 * Bean:在计算机英语中有可重用组件的含义。
 * JavaBean:用java语言编写的可重用组件。
 *      javaBean > 实体类
 *
 *      它就是创建我们的service和dao对象的
 *
 *      第一，需要配置文件。
 *      第二，通过读取配置文件中的内容，反射创建对象。
 * @date 2020/3/5
 */
public class BeanFactory {
    private static Properties props;
    //定义一个Map,用于存放我们要创建的对象。称之为容器
    private static Map<String, Object> beans;
    static {
        props = new Properties();
        try {
            props.load(BeanFactory.class.getClassLoader()
                    .getResourceAsStream("bean.properties"));
            //实例化容器
            beans = new HashMap<>();
            //取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key, value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    public static Object getBean(String beanName) {
      /*  Object bean = null;
        try {
            String beanPath = props.getProperty(beanName);
            bean = Class.forName(beanPath).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;*/
        return beans.get(beanName);
    }
}
