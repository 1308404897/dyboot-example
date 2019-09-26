package com.duanya.example.nacos;

import com.duanya.example.nacos.service.TestClinetService;
import com.duanya.spring.framework.annotation.DyBootApplication;
import com.duanya.spring.framework.annotation.DyNacosServiceClient;
import com.duanya.spring.framework.starter.run.DyBootApplicationRun;


/**
 * @Desc NacosApplication
 * @Author Zheng.LiMing
 * @Date 2019/9/11
 */
@DyBootApplication
public class NacosApplication {

    public static  void  main(String[] args ) {
        DyBootApplicationRun.run(NacosApplication.class);

    }
}
