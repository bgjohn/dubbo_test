package com.jdkeji.service;


import com.alibaba.dubbo.config.annotation.Service;

//必须使用dubbo提供的注解
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "hello dubbo";
    }
    publi void practice(){
        return "high my git";
    }

}
