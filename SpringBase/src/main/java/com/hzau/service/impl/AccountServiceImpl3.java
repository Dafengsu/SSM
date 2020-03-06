package com.hzau.service.impl;

import com.hzau.service.AccountService;

import java.util.*;

/**
 * @author su
 * @description 账户的业务层实现类
 * @date 2020/3/5
 */
public class AccountServiceImpl3 implements AccountService {

    private String[] myStrings;
    private List<String> myList;
    private Map<String, String> myMap;
    private Set<String> mySet;
    private Properties myProps;

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyStrings(String[] myStrings) {
        this.myStrings = myStrings;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    @Override
    public void saveAccount() {
        System.out.println(Arrays.toString(myStrings));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }


}
