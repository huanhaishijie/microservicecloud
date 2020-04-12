package com.yuezhiming.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//Eureka服务端启动类，接受其它微服务注册进来
public class MicroservicecloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEurekaApplication.class, args);
    }

}
