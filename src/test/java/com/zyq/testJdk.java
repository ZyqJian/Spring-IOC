package com.zyq;

import com.zyq.proxy.Dell;
import com.zyq.proxy.Sale;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zyq
 * @date 2018/7/16 13:27
 */
public class testJdk {
    public void testJdk(Object target1){
         Object target = target1;
         //产生动态的代理
        Sale sale = (Sale)java.lang.reflect.Proxy.newProxyInstance(Dell.class.getClassLoader(),
                Dell.class.getInterfaces(),new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("前置通知");
                        Object result = method.invoke(target,args);
                        System.out.println("后置通知");
                        return result;
                    }
                });
        //获得类的完全限定名
        System.out.println(sale.getClass().getName());
        sale.save();
        int price = sale.price();

    }

    @Test
    public void testDell(){
        Dell dell = new Dell();
        testJdk(dell);
    }
}
