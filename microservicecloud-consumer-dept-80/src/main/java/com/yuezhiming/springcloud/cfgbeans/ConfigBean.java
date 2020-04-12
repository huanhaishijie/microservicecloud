package com.yuezhiming.springcloud.cfgbeans;/**
 * Created by ASUSon 2019/10/20 9:17
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: microservicecloud
 * @description: 。。。。
 * @author: yuezm
 * @create: 2019-10-20 09:17
 **/
@Configuration //=》applicationContext.xml
public class ConfigBean {

    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于NetFlix Ribbon实现的一套客户端 负载均衡工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /*@Bean
    public IRule myRule(){  //配置负载均衡Ribbon策略
        return new RandomRule();//随机策略
    }*/
}
