package com.hzau.domain;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/2/29
 */
public class QueryVo {
    private User user;
    private List<Integer> ids;

    public QueryVo() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
