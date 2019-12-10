package com.qiu.day01.controller;
import com.qiu.day01.entity.Employee;
import com.qiu.day01.service.EmployeeService;
import com.qiu.day01.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:SysUserController
 * @date:2019/6/30
 */
@Api(tags = {"用户控制器"})
@RestController
@RequestMapping("/system/sysUser")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "获取全部用户信息")
    @GetMapping("/getList")
    public AjaxResult list(){
        List<Employee> list = employeeService.findList();
       return null;
    }


}
