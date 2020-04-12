package com.yuezhiming.springcloud.service;

import com.yuezhiming.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUSon 2019/12/12 20:08
 */
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/getDept/{id}", method = RequestMethod.GET)
    public Map<String, Object> getDept(@PathVariable("id") Long id);

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Dept> getlist();

    @RequestMapping(value = "addDept", method = RequestMethod.POST)
    public Integer addDept(Dept dept);

}
