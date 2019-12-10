package com.qiu.day01.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.qiu.day01.baseentity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("sys_user")
public class Employee extends BaseEntity implements Serializable {
    @TableId
    private Long id;
    private String userName;
    private String nickName;
    private String password;
    private Integer roleId;
    private Integer deptId;
    private String remark;
    private Integer status;
    private String email;
    private String phone;
}