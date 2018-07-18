package com.zyq;

import com.zyq.proxy.Sale;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zyq
 * @date 2018/7/16 10:53
 */
public class testAop {
    @Test
  public void teatAopDell(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-aop.xml");
        Sale sale = (Sale)applicationContext.getBean("dell");
        /*System.out.println(sale.getClass().getName());*/
        sale.save();
        int price = sale.price();
  }
}
