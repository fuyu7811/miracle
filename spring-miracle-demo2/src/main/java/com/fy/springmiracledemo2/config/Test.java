package com.fy.springmiracledemo2.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Configuration
public class Test {


    @Bean
    public int hhhh() throws Exception {
        Connection connection = Coon.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from roles");
        return 0;
    }
}
