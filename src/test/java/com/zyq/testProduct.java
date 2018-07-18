package com.zyq;

import com.zyq.dao.ProductDao;
import com.zyq.entity.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date 2018/7/17 13:50
 */
public class testProduct extends testBaseCase {
    @Autowired
    private ProductDao productDao;

    @Test
    public void testFindById(){
        Product product = productDao.findById(2);
        System.out.println(product);
    }

    @Test
    public void testSave(){
        Product product = new Product();
        product.setName("zyqzyq");
        product.setInventory("183");
        productDao.saveProduct(product);
    }

    @Test
    public void testFindAll(){
        List<Product> productList = productDao.findAll();
        for(Product product : productList){
            System.out.println(product);
        }
    }

    @Test
    public void testCount(){
        int count = productDao.findCount();
        System.out.println(count);
    }

    @Test
    public void testMapOfList(){
        List<Map<String,Object>> mapList = productDao.findAllMap();
        for(Map<String,Object> map : mapList){
            for (Map.Entry<String,Object> entry : map.entrySet()){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
        }

        @Test
    public void testUpdate(){
        Product product = productDao.findById(2);
        product.setName("momo");
        productDao.updateById(product);
        }

}
