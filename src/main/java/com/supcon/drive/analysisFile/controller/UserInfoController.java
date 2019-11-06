package com.supcon.drive.analysisFile.controller;

import com.supcon.drive.analysisFile.Dao.UserInfoRepository;
import com.supcon.drive.analysisFile.Model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("/getAllUsers")
    public List<UserInfo> getUserList(){
        return userInfoRepository.findAll();
    }

    @RequestMapping("/addUser")
    @Transactional
    public UserInfo addUser(@RequestParam("userName") String userName, @RequestParam("password") String password){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(userName);
        userInfo.setPassword(password);
        this.userInfoRepository.save(userInfo);
        return userInfo;
    }

}
