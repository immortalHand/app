package com.app.service;

import com.app.mapper.Backend_userMapper;
import com.app.pojo.Backend_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Description:用户表实体类业务逻辑层实现
 * @Author 罗曼蒂克
 * @Date Created in 14:15   2018/4/25
 */
@Service
public class Backend_userServiceImpl implements Backend_userService {

    @Autowired
    private Backend_userMapper backend_userMapperr;
    @Override
    public int backLogin(Backend_user backend_user) {
        return backend_userMapperr.backLogin(backend_user);
    }
}
