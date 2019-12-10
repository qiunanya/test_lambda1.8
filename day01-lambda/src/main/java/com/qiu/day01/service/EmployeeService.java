package com.qiu.day01.service;

import com.baomidou.mybatisplus.service.IService;
import com.qiu.day01.entity.Employee;

import java.util.List;

/**
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/6/26 20:58
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> findList();
}
