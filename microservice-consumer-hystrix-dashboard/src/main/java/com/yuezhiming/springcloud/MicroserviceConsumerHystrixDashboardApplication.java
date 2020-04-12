package com.yuezhiming.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 服务监控 需要服务端有actuator支持
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerHystrixDashboardApplication.class, args);
    }
}
