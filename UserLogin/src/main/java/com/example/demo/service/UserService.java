package com.example.demo.service;

import java.util.List;
import com.example.demo.info.UserInfo;

public interface UserService {
    UserInfo createUser(UserInfo userInfo);
    List<UserInfo> allUsers();
}
