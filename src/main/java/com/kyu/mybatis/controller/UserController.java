package com.kyu.mybatis.controller;

import com.kyu.mybatis.controller.common.response.SuccessMsgResponse;
import com.kyu.mybatis.entity.User;
import com.kyu.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/api/add_user")
    public @ResponseBody SuccessMsgResponse addUser(@RequestParam String username,
                                                    @RequestParam String password,
                                                    @RequestParam String gender,
                                                    @RequestParam String address){
        User user = new User();

        return userService.addUser(user);
    }

    @PostMapping(path = "/api/delete_user")
    public @ResponseBody SuccessMsgResponse deleteUser(@RequestParam String username){


        return userService.deleteByUsername(username);
    }

    @PostMapping(path = "/api/find_user")
    public @ResponseBody SuccessMsgResponse findUser(@RequestParam String address){


        return userService.findByAddress(address);
    }


}
