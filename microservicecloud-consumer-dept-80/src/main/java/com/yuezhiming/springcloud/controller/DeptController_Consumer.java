package com.yuezhiming.springcloud.controller;/**
 * Created by ASUSon 2019/10/20 9:25
 */

import com.yuezhiming.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: microservicecloud
 * @description: 部门
 * @author: yuezm
 * @create: 2019-10-20 09:25
 **/
@RestController
public class DeptController_Consumer {

    //    @Value("${Producter.url}")
    private static final String url = "http://MICROSERVICECLOUD-PROVIDER-DEPT"; //Ribbon和Eureka整合后Consumer可以直接调用服务而不用地址和端口号


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll() {
        return restTemplate.getForObject(url + "/list", List.class);
    }

    @RequestMapping("/consumer/getDept/{id}")
    public Dept getDeptById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(url + "/getDept/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public Integer add(@RequestBody Dept dept) {
        return restTemplate.postForObject(url + "/addDept", dept, Integer.class);
    }


}
