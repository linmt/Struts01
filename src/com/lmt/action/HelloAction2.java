package com.lmt.action;

import com.lmt.entity.User;

/**
 * Created by 热带雨林 on 2019/1/1.
 */
public class HelloAction2 {
    //基本属性
    private String realName;
    //对象
    private User user;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
        System.out.println("注入realName...");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        System.out.println("注入user...");
    }

    public String sayHello() {
        //输出基本属性
        System.out.println("realName..."+realName);

        //输出域模型
        System.out.println("userName:" + user.getUserName());
        System.out.println("password:" + user.getPassword());
        return "ok";
    }
}
