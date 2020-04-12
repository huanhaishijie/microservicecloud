package com.yuezhiming.springcloud.entity;/**
 * Created by ASUSon 2019/10/8 22:19
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: microservicecloud

 * @description: 部门

 * @author: yuezm

 * @create: 2019-10-08 22:19
 **/


@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@ToString
public class Dept implements Serializable {


    private Integer deptno;//主键
    private String dName;//部门名称
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库


}
