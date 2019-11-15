package com.fy.springmiracledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMiracleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMiracleDemoApplication.class, args);
    }

}
