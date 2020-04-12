package com.yuezhiming.springcloud.service.Impl;/**
 * Created by ASUSon 2019/10/18 16:06
 */

import com.yuezhiming.springcloud.dao.DeptMapper;
import com.yuezhiming.springcloud.entity.Dept;
import com.yuezhiming.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: microservicecloud
 * @description: 部门
 * @author: yuezm
 * @create: 2019-10-18 16:06
 **/

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;


    @Override
    public Map<String, Object> deptById(Long deptno) {

        return deptMapper.deptById(deptno);
    }

    @Override
    public Integer addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
