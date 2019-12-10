package com.qiu.day01.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qiu.day01.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/6/26 20:57
 */
@Mapper
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {
}
