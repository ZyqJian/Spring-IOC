package com.zyq;

import com.zyq.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zyq
 * @date 2018/7/13 17:51
 */
public class testUserDao {

    @Test
    public void testSave(){
        /*在启动容器的时候，就创建了对象*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        /* UserDao userDao1=(UserDao) applicationContext.getBean("userDao");*/
        /*System.out.println(userDao == userDao1);*/
        userDao.save();
        /*((ClassPathXmlApplicationContext) applicationContext).close();*/

        }
}
