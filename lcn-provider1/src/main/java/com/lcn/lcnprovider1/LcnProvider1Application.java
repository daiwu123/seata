package com.lcn.lcnprovider1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//配置mybatis扫描的mapper类，生成mapper对象操作数据库
@MapperScan("com.lcn.lcnprovider1.dao")
//开启服务发现客户端
@EnableDiscoveryClient
//开启feign
@EnableFeignClients
public class LcnProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(LcnProvider1Application.class, args);
    }

}
