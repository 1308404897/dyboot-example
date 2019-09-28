//package com.duanya.example.nacos;
//
//import com.duanya.spring.framework.annotation.DyBean;
//import com.duanya.spring.framework.annotation.DyConfiguration;
//import com.duanya.spring.framework.nacos.balance.DefaultNacosBalanceServiceImpl;
//import com.duanya.spring.framework.nacos.rest.RestClient;
//
///**
// * @Desc Config
// * @Author Zheng.LiMing
// * @Date 2019/9/19
// */
//@DyConfiguration
//public class Config {
//
//    @DyBean
//    public RestClient restClient(){
//        RestClient restClient=new RestClient();
//        restClient.setDyNacosBalanceSerivce(new DefaultNacosBalanceServiceImpl());
//        return restClient;
//    }
//}
