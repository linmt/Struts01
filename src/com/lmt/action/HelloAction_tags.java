package com.lmt.action;

import com.lmt.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 热带雨林 on 2019/1/1.
 */
public class HelloAction_tags {
    //基本属性
    private String name;
    private Integer age;
    //实体对象
    private User user;
    //数组、集合
    private String[] langs;
    private List<String> cities;
    //Map
    private Map<String, Object> map;

    public String sayHello() {
        //初始化基本属性
        name = "Tarena";
        age = 9;
        //初始化实体对象
        user = new User();
        user.setUserName("zhangsan");
        user.setPassword("123");
        //初始化数组和集合
        langs = new String[] {"Java","php",".net"};
        cities = new ArrayList<String>();
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        //初始化Map
        map = new HashMap<String, Object>();
        map.put("beijing", "2800万人");
        map.put("shanghai", "2300万人");
        map.put("guangzhou", "2500万人");

        return "ok";
    }

    public String[] getLangs() {
        return langs;
    }

    public void setLangs(String[] langs) {
        this.langs = langs;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
