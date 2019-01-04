package com.lmt.entity;

/**
 * Created by 热带雨林 on 2019/1/1.
 */
public class User {
    private String userName;

    private String password;

    public User() {
        System.out.println("实例化user");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("注入userName");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
