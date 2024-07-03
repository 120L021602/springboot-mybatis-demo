package com.kyu.mybatis.service;

import com.kyu.mybatis.controller.common.response.SuccessMsgResponse;
import com.kyu.mybatis.dao.UserMapper;
import com.kyu.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public SuccessMsgResponse addUser(User user){

        userMapper.insert(user);

        return new SuccessMsgResponse();
    }

    public SuccessMsgResponse deleteByUsername(String username){

        userMapper.deleteByUsername(username);

        return new SuccessMsgResponse();
    }

    public SuccessMsgResponse findByAddress(String address){

        List<User> userList = new ArrayList<>();

        userList = userMapper.findByAddress(address);

        for (User user : userList) {
            System.out.println(user);
        }

        return new SuccessMsgResponse();
    }
}
