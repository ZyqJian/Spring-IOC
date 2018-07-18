package com.zyq;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zyq
 * @date 2018/7/17 11:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Application.class)
@ContextConfiguration(locations = "classpath:Spring.xml")
public class testBaseCase {
}
