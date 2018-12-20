package com.wzh.model;

import java.util.Date;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月09日
 */
public class User {

    private int id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User[" + "id=" + id + ", name='" + name + '\'' + ']';
    }
}