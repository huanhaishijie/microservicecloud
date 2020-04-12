package com.yuezhiming.springcloud.controller;/**
 * Created by ASUSon 2019/10/20 9:25
 */

import com.yuezhiming.springcloud.entity.Dept;
import com.yuezhiming.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @program: microservicecloud
 * @description: 部门
 * @author: yuezm
 * @create: 2019-10-20 09:25
 **/
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll() {
        return deptClientService.getlist();
    }

    @RequestMapping("/consumer/getDept/{id}")
    public Map<String, Object> getDeptById(@PathVariable("id") Long id) {
        return deptClientService.getDept(id);
    }

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public Integer add(@RequestBody Dept dept) {
        return deptClientService.addDept(dept);
    }
}
