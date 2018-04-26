package com.app.controller;

import com.app.service.Backend_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Description:用户表控制器
 * @Author 罗曼蒂克
 * @Date Created in 14:23   2018/4/25
 */

@Controller
public class Backend_userController {

    @Autowired
    private Backend_userService backend_userService;

    @RequestMapping("/index")
    public String  backLogin(){
        return "text";
    }



}
