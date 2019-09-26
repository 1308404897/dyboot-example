package com.duanya.example.nacos.controller;

import com.duanya.example.nacos.service.TestClinetService;
import com.duanya.spring.framework.annotation.DyAutowired;
import com.duanya.spring.framework.annotation.DyGet;
import com.duanya.spring.framework.annotation.DyRequestMapping;
import com.duanya.spring.framework.annotation.DyRestController;

/**
 * @Desc TestClinetController
 * @Author Zheng.LiMing
 * @Date 2019/9/19
 */
@DyRestController
@DyRequestMapping("/v1/test")
public class TestClinetController {


    @DyAutowired
    private TestClinetService nacosService2;

    @DyGet
    public Integer get() {
       return nacosService2.getStu();
    }
}
