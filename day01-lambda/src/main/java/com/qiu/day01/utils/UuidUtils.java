package com.qiu.day01.utils;

import java.util.UUID;

/**
 * @author:Mr.qiu
 * @class:UuidUtils
 * @date:2019/8/28
 */
public class UuidUtils {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().substring(10);
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
