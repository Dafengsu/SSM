package com.hzau.mybatis.io;

import java.io.InputStream;

/**
 * @author su
 * @description
 * @date 2020/2/28
 */
public class Resources {
    /**
     * 根据传入的参数拿到字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
       return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
