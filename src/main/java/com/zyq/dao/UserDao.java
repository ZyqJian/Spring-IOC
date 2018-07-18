package com.zyq.dao;

import com.zyq.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyq
 * @date 2018/7/13 17:38
 */
@Service
public class UserDao {
    @Autowired
    private UserService userservice;

    public void save(){
        System.out.println("success!!");
        userservice.save();
    }

    /*set的方式进行注入*/
   /*public void setUserService(UserService userService) {
        this.userService = userService;
    }*/


   /* public UserDao(UserService userService){

    }*/

   /* public void  init(){
        System.out.println("初始化");
    }

    public  void destory(){
        System.out.println("销毁的");
    }*/


}
