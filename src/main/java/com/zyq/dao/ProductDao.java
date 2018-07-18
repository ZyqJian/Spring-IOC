package com.zyq.dao;

import com.zyq.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date 2018/7/17 13:38
 */
@Repository
public class ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Product findById(Integer id){
        String sql="select * from product where id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),id);
    }

    public void saveProduct(Product product){
        String sql ="insert into product (inventory,name) values (?,?)";
        jdbcTemplate.update(sql,product.getName(),product.getInventory());
    }

    public List<Product> findAll(){
        String sql="select * from product";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Product.class));
    }

    public int findCount(){
        String sql = "select count(*) from product";
        return jdbcTemplate.queryForObject(sql,new SingleColumnRowMapper<Long>()).intValue();
    }

    public List<Map<String,Object>> findAllMap(){
        String sql ="select * from product";
        return jdbcTemplate.query(sql,new ColumnMapRowMapper());
    }

    public void updateById(Product product){
        String sql="update product set name = ? where id = ?";
        jdbcTemplate.update(sql,product.getName(),product.getId());
    }


}
