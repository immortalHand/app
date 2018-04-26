package com.app.service;

import com.app.mapper.Dev_userMapper;
import com.app.pojo.Dev_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:试帐号的接口业务逻辑层实现
 * @Author 罗曼蒂克
 * @Date Created in 14:13   2018/4/25
 */
@Service
public class Dev_userServiceImpl implements Dev_userService {


    @Autowired
    private Dev_userMapper dev_userMapper;
    @Override
    public Dev_user dologin(Dev_user user) {
        return dev_userMapper.dologin(user);
    }
}
