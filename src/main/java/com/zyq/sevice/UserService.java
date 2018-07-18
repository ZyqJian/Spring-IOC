package com.zyq.sevice;

import org.springframework.stereotype.Repository;

/**
 * @author zyq
 * @date 2018/7/14 9:36
 */
@Repository
public class UserService {
    public void save(){
        System.out.println("调用方法");
    }
}
