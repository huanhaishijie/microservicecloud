package com.yuezhiming.springcloud.dao;

import com.yuezhiming.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;
import java.util.Map;

/**
 * Created by ASUSon 2019/10/16 21:25
 */
@Mapper
public interface DeptMapper {

    @Select("select deptno, dname from dept where deptno = #{deptno}")
    Map<String, Object> deptById(@Param("deptno") Long deptno);

    Integer addDept(Dept dept);

    List<Dept> findAll();


}
