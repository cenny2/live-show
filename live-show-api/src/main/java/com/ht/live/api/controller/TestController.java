package com.ht.live.api.controller;

import com.ht.live.user.interfaces.IUserServiceRpc;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author: Torrey
 * @Date: 2023/9/12 22:40
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @DubboReference
    private IUserServiceRpc iUserServiceRpc;
    @GetMapping("dubbo")
    public String dubbo(){
        String test = iUserServiceRpc.test();
        return test;
    }

}
