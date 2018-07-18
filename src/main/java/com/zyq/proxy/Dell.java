package com.zyq.proxy;

/**
 * @author zyq
 * @date 2018/7/16 10:39
 */
public class Dell implements Sale {
    @Override
    public void save() {
        System.out.println("这是Dell");
    }

    @Override
    public int price() {
        System.out.println("这是10元");
        return 10;
    }
}
