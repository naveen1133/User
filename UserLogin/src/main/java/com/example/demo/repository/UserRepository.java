package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.info.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
}
