package com.yuezhiming.springcloud.controller;/**
 * Created by ASUSon 2019/12/30 2050
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program microservicecloud

 * @description 初始化信息

 * @author yuezm

 * @create 2019-12-30 2050
 **/
@RestController
public class InitInFo {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaName;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String config() {
        return "applicationName:  " + applicationName + " eurekaName:" + eurekaName + "  服务端口号:" + port;
    }
}