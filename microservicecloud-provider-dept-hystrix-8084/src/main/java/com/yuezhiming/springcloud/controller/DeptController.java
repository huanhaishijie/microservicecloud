package com.yuezhiming.springcloud.controller;/**
 * Created by ASUSon 2019/10/18 16:17
 */




import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yuezhiming.springcloud.entity.Dept;
import com.yuezhiming.springcloud.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

import static com.yuezhiming.srpingcloud.utils.EntityUtils.entityToMap;

/**
 * @program: microservicecloud
 * @description: 部门控制层
 * @author: yuezm
 * @create: 2019-10-18 16:17
 **/

@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @Autowired
    DiscoveryClient client;

    @RequestMapping(value = "/getDept/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@Hystrix标注好的fallbackHandler调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Map<String, Object> getDept(@PathVariable("id") Long id) {
        if(deptService.deptById(id) == null){
            throw new RuntimeException("没有相对应的信息");
        }
        return deptService.deptById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test() {
        return "springcloud启动成功";
    }


    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public List<Dept> getlist() {
        return deptService.findAll();
    }

    @RequestMapping(value = "addDept", method = RequestMethod.POST)
    @ResponseBody
    public Integer addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("*****************" + list);
        List<ServiceInstance> srvList = client.getInstances("dept");

        srvList.forEach(item -> {
            System.out.println(item.getServiceId() + "\t" + item.getHost() + "\t" + item.getPort() + item.getUri());
        });
        return this.client;
    }

    public Map<String, Object> processHystrix_Get(Long id){
        return   entityToMap(new Dept().setDeptno(Integer.parseInt(id.toString())).setDName(
                "该id："+ id + "没有对应的信息，null --@HystrixCommand").setDb_source("no this database in mySql"));
    }


}
