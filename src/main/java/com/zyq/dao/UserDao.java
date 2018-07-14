package com.zyq.dao;

import com.zyq.sevice.UserService;

/**
 * @author zyq
 * @date 2018/7/13 17:38
 */
public class UserDao {
    private UserService userService;

    public void save(){
        userService.save();
    }

    /*set的方式进行注入*/
   public void setUserService(UserService userService) {
        this.userService = userService;
    }


   /* public UserDao(UserService userService){

    }*/

   /* public void  init(){
        System.out.println("初始化");
    }

    public  void destory(){
        System.out.println("销毁的");
    }*/


}
