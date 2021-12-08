package com.lcn.lcnconsumer;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//配置mybatis扫描的mapper类，生成mapper对象操作数据库
@MapperScan("com.lcn.lcnconsumer.dao")
//开启服务发现客户端
@EnableDiscoveryClient
//开启feign
@EnableFeignClients
public class LcnConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LcnConsumerApplication.class, args);
        DruidDataSource dataSource = (DruidDataSource)run.getBean("getDataSource");
        System.out.println(dataSource.getUsername());
    }

}
