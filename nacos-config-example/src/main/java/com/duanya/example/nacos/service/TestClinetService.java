package com.duanya.example.nacos.service;

import com.duanya.spring.framework.annotation.DyGet;
import com.duanya.spring.framework.annotation.DyNacosServiceClient;

/**
 * @Desc NacosService
 * @Author Zheng.LiMing
 * @Date 2019/9/18
 */
@DyNacosServiceClient(servieName = "NICE2",groupName = "h2")
public interface TestClinetService {

    @DyGet("/123")
    Integer getStu();
}
