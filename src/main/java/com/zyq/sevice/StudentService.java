package com.zyq.sevice;

import com.zyq.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zyq
 * @date 2018/7/14 11:03
 */

public class StudentService {
    /*基本类型的注入*/

    private Integer age;

    private String name;

    private Map<String,String> map;

    private List<String> list;

    private Properties properties;

    private Set<Double> doubles;

    private UserDao userDao;


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<Double> getDoubles() {
        return doubles;
    }

    public void setDoubles(Set<Double> doubles) {
        this.doubles = doubles;
    }


}
