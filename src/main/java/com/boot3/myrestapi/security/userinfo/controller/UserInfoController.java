package com.boot3.myrestapi.security.userinfo.controller;

import com.boot3.myrestapi.security.userinfo.entity.UserInfo;
import com.boot3.myrestapi.security.userinfo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserInfoController {
    @Autowired
    private UserInfoRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        UserInfo savedUserInfo = repository.save(userInfo);
        return savedUserInfo.getName() + " user added!!";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

}
