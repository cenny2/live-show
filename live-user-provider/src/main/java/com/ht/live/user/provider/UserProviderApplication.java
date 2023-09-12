package com.ht.live.user.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @ClassName UserProviderApplication
 * @Description: TODO 用户中台dubbo服务提供者
 * @Author: Torrey
 * @Date:
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
public class UserProviderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(UserProviderApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);

    }
}
