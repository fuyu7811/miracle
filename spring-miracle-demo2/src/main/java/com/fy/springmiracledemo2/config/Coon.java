package com.fy.springmiracledemo2.config;

import java.sql.*;

public class Coon {

    Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nacos?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8", "root", "123456");
            System.out.println("数据库连接成功");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}