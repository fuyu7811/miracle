package com.fy.springmiracledemo2.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author :  fuhw
 * @Description :  java类作用描述
 * @CreateDate :  2020/7/7 16:16
 * @UpdateUser :  fuhw
 * @UpdateDate :  2020/7/7 16:16
 * @UpdateRemark :  修改内容
 * @Version :  1.0
 */
@Configuration
@MapperScan(basePackages = "com.fy.springmiracledemo2.mapper.master", sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceConfig {


    @Primary
    @Bean
    @Qualifier("masterDataSource")
    @ConfigurationProperties("db.datasource.master")
    public DataSource masterDataSource() {
        DataSource build = DataSourceBuilder.create().build();
        return build;
    }

    @Primary
    @Bean(name = "masterSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("masterDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);

        return sessionFactoryBean.getObject();
    }
}
