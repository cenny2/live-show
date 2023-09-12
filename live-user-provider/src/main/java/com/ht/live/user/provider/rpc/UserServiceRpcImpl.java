package com.ht.live.user.provider.rpc;

import com.ht.live.user.interfaces.IUserServiceRpc;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @ClassName UserSeriveRpcImpl
 * @Description: TODO
 * @Author: Torrey
 * @Date: 2023/9/12 20:59
 **/
@DubboService
public class UserServiceRpcImpl implements IUserServiceRpc {

    @Override
    public String test() {
        System.out.println("this is user rpc service impl 。。。");
        return "Sucess!";
    }
}
