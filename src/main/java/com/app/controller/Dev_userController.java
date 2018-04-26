package com.app.controller;

import com.app.pojo.Dev_user;
import com.app.service.Dev_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:测试账号表的控制器
 * @Author 罗曼蒂克
 * @Date Created in 14:25   2018/4/25
 */
@Controller
@RequestMapping("user")
public class Dev_userController {

    @Autowired
    private Dev_userService dev_userService;

    @PostMapping("dologin")
    public String dologin(Dev_user user){
        Dev_user dev_user = dev_userService.dologin(user);
        if (dev_user!=null){
            return "developer/appinfolist";
        }
        return "devlogin";
    }

}
