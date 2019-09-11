package com.duanya.example.web.controller;

import com.duanya.spring.framework.annotation.*;

/**
 * @Desc HelloworldController
 * @Author Zheng.LiMing
 * @Date 2019/9/12
 */

/** DyRequestMapping 设置请求根路径，默认为"/"， DyRestController 告诉程序让mvc来处理*/
@DyRequestMapping
@DyRestController
public class HelloworldController {

    /**
     * GET的请求，默认为"/"
     * @return
     */
    @DyGet
    public String hello(){
        return "hello，欢迎使用dyboot-stater-web架构！";
    }

    /**
     * POST的请求，默认为"/"
     * @return
     */
    @DyPost
    public String post(){
        return "hi，您使用的是post请求！";
    }

    @DyPut
    public String put(){
        return "hi，您使用的是PUT请求 ！";
    }

    @DyDelete
    public String delete(){
        return "hi，您使用的是DELETE请求 ！";
    }

}
