package com.fy.springmiracledemo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableApolloConfig
public class SpringMiracleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMiracleDemoApplication.class, args);
//        Config config = ConfigService.getAppConfig();
//        String fuhognwei = config.getProperty("fuhongwei", "defaultValue");
//        System.out.println(fuhognwei);
    }

}
