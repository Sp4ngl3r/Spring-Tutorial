package com.chat.app.ChattingApp.controller;

import com.chat.app.ChattingApp.model.User;
import com.chat.app.ChattingApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public String getUserDetails(@RequestBody User user){
        userService.saveUser(user);
        return "User Added";
    }
}
