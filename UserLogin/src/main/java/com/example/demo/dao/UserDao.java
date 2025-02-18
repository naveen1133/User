package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.info.UserInfo;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserDao implements UserService {
    
    @Autowired
    private UserRepository repo;

    @Override
    public UserInfo createUser(UserInfo userInfo) {
        return repo.save(userInfo);
    }

    @Override
    public List<UserInfo> allUsers() {
        return repo.findAll();
    }
}
