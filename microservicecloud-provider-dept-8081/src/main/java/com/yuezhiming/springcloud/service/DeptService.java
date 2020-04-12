package com.yuezhiming.springcloud.service;

import com.yuezhiming.springcloud.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUSon 2019/10/18 16:05
 */
public interface DeptService {


    Map<String, Object> deptById(Long deptno);

    Integer addDept(Dept dept);

    List<Dept> findAll();
}
