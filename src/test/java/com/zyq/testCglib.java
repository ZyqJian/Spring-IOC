package com.zyq;


import com.zyq.proxy.Dell1;
import com.zyq.proxy.ProxyDell1;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author zyq
 * @date 2018/7/16 11:23
 */

public class testCglib {
    @Test
    public void testCglib1(){
        Enhancer enhancer = new Enhancer();
        //动态代理模板
        //调用Dell1的类
        enhancer.setSuperclass(Dell1.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置通知");
                Object result =  methodProxy.invokeSuper(obj, args);
                System.out.println("后置通知");
              return result;

            }
        });

        //产生具体的动态代理对象,是目标对象的子类
        Dell1 dell1 = (Dell1) enhancer.create();
       dell1.save();
    }

    @Test
    public void testStaticCglib(){
        //进行静态代理的调用
        //直接到用的是子类里面的方法,也可以进行Spring的管理
        ProxyDell1 proxyDell1 = new ProxyDell1();
        proxyDell1.save();

    }


}
