package com.example.TekarchUserMS.Services.Interfaces;

import com.example.TekarchUserMS.Models.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User getUserByuserId(Long userId);
    void updateUserByuserId(Long userId, User user);
}
