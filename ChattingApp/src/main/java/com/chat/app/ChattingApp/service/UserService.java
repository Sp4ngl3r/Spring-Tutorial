package com.chat.app.ChattingApp.service;

import com.chat.app.ChattingApp.model.User;
import com.chat.app.ChattingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
        // Prints all the user details
        System.out.println(userRepository.findAll());
    }
}
