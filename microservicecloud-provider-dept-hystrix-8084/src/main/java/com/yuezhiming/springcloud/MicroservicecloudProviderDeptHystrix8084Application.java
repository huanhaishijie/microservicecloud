package com.yuezhiming.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

//@SpringBootApplication
//@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现
//@EnableCircuitBreaker//对hystrix熔断机制的支持

@SpringCloudApplication //这个注解包含上面四个注解
public class MicroservicecloudProviderDeptHystrix8084Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDeptHystrix8084Application.class, args);
    }

//    @Bean
//    public ServletRegistrationBean hystrixMetricsStreamServlet() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
//        registration.addUrlMappings("/hystrix.stream");
//        return registration;
//    }

}
