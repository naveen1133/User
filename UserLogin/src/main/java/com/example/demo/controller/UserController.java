package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.UserDao;
import com.example.demo.info.UserInfo;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserDao dao;
    
    @PostMapping(path="/createuser")
    public UserInfo createUser(@RequestBody UserInfo userInfo) {
//        if (userInfo.getUserName() == null || userInfo.getPassword() == null) {
//            throw new IllegalArgumentException("Username and password cannot be null");
//        }
        return dao.createUser(userInfo);
    }

    @GetMapping(path="/users")
    public List<UserInfo> getAll(){
        return dao.allUsers();
    }
}
