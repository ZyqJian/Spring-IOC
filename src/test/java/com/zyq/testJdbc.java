package com.zyq;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author zyq
 * @date 2018/7/18 14:22
 */
public class testJdbc {

    PreparedStatement preparedStatement = null;
    @Test
    public void testJdbc() throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "zyq");

            /*前置通知*/
            connection.setAutoCommit(false);

            try {
                /*处理业务*/
                String sql = "insert into product (inventory,name) values (?,?) ";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,"amy");
                preparedStatement.setString(2,"123");
                preparedStatement.executeUpdate();

                /*后置通知*/
                connection.commit();
                /*异常通知*/
            }catch (SQLException e){
                connection.rollback();
                /*最终通知*/
            }finally {
                preparedStatement.close();
                connection.close();
            }







    }
}
