package com.qiu.day01.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qiu.day01.entity.Employee;
import com.qiu.day01.mapper.EmployeeMapper;
import com.qiu.day01.service.EmployeeService;
import com.qiu.day01.utils.StatisContant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:SysUserServiceImpl
 * @date:2019/6/26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


    @Override
    public List<Employee> findList() {
        EntityWrapper<Employee> wrapper = new EntityWrapper<>();
        wrapper.eq("status",StatisContant.ONE);
        List<Employee> list = this.selectList(wrapper);
        return list;
    }
}
