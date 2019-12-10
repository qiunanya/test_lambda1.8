package com.qiu.day01.baseentity;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author:Mr.qiu
 * @class:BaseEntity
 * @date:2019/6/26
 */
@Data
public class BaseEntity implements Serializable {
    private Date createTime;
    private Date updateTime;
    private Integer updateVersion;
}
