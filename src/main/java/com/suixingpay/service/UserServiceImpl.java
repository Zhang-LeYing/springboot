package com.suixingpay.service;



import com.suixingpay.bean.User;

import com.suixingpay.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;


    public boolean add(User user){
        boolean sign = false;
        try {
            userMapper.add(user);
            sign = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sign;

    }
}

