package com.yuezhiming.springcloud.service;/**
 * Created by ASUSon 2019/12/22 19:08
 */

import com.yuezhiming.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


import static com.yuezhiming.srpingcloud.utils.EntityUtils.entityToMap;
/**
 * @program: microservicecloud

 * @description:

 * @author: yuezm

 * @create: 2019-12-22 19:08
 **/

@Component //注入要添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Map<String, Object> getDept(Long id) {
                return entityToMap(new Dept().setDeptno(Integer.parseInt(id.toString())).setDName(
                        "该id："+ id + "该服务已关闭，null --@HystrixCommand").setDb_source("no this database in mySql"));
            }

            @Override
            public List<Dept> getlist() {
                return null;
            }

            @Override
            public Integer addDept(Dept dept) {
                return null;
            }
        };
    }
}
