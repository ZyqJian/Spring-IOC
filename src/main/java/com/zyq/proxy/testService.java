package com.zyq.proxy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zyq
 * @date 2018/7/16 17:08
 */
public class testService {
    private testDao testDao;

    /*在set注入上面使用注解*/
    public void save(){
        testDao.save();
        System.out.println("这是在调用testDao");
    }
    @Autowired
    public void setTestDao(testDao testDao) {
        this.testDao = testDao;
    }

}
