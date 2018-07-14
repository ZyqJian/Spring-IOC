package com.zyq;

import com.zyq.sevice.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @author zyq
 * @date 2018/7/14 11:22
 */
public class testStudent {
    @Test
    public void testGetStudent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         /*name 是前面的id!!!*/
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");

        System.out.println(studentService.getAge());
        System.out.println(studentService.getName());
        System.out.println(studentService.getUserDao());

        /*得到List集合*/
        List<String> stringList = studentService.getList();
        /*System.out.println(stringList);*/
        for (String string :stringList){
            System.out.println(string);
        }

        /*得到map集合 键值对*/
        Map<String,String> map = studentService.getMap();
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        /*获得set集合*/
        Set<Double> doubles = studentService.getDoubles();
        for (Double double1 :doubles){
            System.out.println(double1);
        }

        Properties properties = studentService.getProperties();
        /*获取的是keys的集合*/
       Enumeration<Object> keys =  properties.keys();
       while (keys.hasMoreElements()) {
           Object key = keys.nextElement();
           Object value = properties.get(key);
           System.out.println(key);
           System.out.println(value);
       }
    }
}
