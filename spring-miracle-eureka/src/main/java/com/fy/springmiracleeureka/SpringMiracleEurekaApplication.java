package com.fy.springmiracleeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMiracleEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMiracleEurekaApplication.class, args);
    }

}
