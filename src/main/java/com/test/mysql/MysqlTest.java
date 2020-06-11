package com.test.mysql;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by mgg on 2020/6/11
 */

public class MysqlTest {




    @Test
    public void JDBCDriver(){

        String url = "jdbc:mysql://127.0.0.1:3306/course?serverTimezone=UTC";
        String username = "root";
        String password = "123456";
        String sql = "INSERT INTO `sort`(`sname`, `sprice`, `sdesc`) VALUES ('2020电脑', 9000, '新款促销');";


        try {
            //获取驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            int i = statement.executeUpdate(sql);
            System.out.println(i);

            //关闭连接
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
