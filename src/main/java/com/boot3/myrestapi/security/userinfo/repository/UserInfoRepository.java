package com.boot3.myrestapi.security.userinfo.repository;

import com.boot3.myrestapi.security.userinfo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByEmail(String username);
}