package com.fy.springmiraclezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringMiracleZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMiracleZuulApplication.class, args);
    }

}
