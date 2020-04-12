package com.yuezhiming.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicecloudConfig5201Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfig5201Application.class, args);
    }

}
