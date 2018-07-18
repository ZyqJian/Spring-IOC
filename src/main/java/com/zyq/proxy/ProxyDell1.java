package com.zyq.proxy;

/**
 * @author zyq
 * @date 2018/7/16 11:30
 */
public class ProxyDell1 extends Dell1 {
    @Override
    public void save() {
        System.out.println("售前服务");
        super.save();
        System.out.println("售后服务");
    }
}
