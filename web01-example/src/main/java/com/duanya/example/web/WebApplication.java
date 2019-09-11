package com.duanya.example.web;

import com.duanya.spring.framework.annotation.DyBootApplication;
import com.duanya.spring.framework.starter.run.DyBootApplicationRun;

/**
 * @Desc web第一个案例，如何使用get、post、delete、put请求
 * @Author Zheng.LiMing
 * @Date 2019/9/12
 */
@DyBootApplication
public class WebApplication {
    public static  void  main(String[] args ){
        DyBootApplicationRun.run(WebApplication.class);
    }
}
