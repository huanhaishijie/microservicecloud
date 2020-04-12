package com.yuezhiming.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@EnableEurekaClient
@EnableFeignClients(basePackages = "com.yuezhiming.springcloud")
public class MicroservicecloudCusumerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudCusumerDeptFeignApplication.class, args);
    }

}
