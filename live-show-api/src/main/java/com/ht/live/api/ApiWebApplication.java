package com.ht.live.api;

import jakarta.servlet.Servlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ApiWebApplication
 * @Description: TODO
 * @Author: Torrey
 * @Date: 2023/9/12 22:25
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApiWebApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApiWebApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}
