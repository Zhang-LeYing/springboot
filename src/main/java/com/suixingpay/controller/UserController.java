package com.suixingpay.controller;

import com.suixingpay.bean.User;
import com.suixingpay.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/add")
    public String hh(){
        String url1 = "";
        //将User中的信息存储到数据库中


        return "login";

    }


    @RequestMapping("/addadd")
    public String add(User user){
        String url = "";
        //将User中的信息存储到数据库中
        System.out.println("哈哈哈");
        boolean result = userService.add(user);
        if(result){
            url = "111";
        }else{
            url = "";
        }
        System.out.println(url);
        return "index";

    }
}
