package com.yuezhiming.springcloud;

import com.yuezhiming.ribbonRule.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-PROVIDER-DEPT", configuration = MySelfRule.class)
public class MicroservicecloudCusumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudCusumerDept80Application.class, args);
    }

}
