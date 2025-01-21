package com.example.TekarchUserMS.Controller;


import com.example.TekarchUserMS.Models.User;
import com.example.TekarchUserMS.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserServiceController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserByuserId(userId);
    }

    @PutMapping("/{userId}")
    public void updateUserById(@PathVariable Long userId, @RequestBody User user) {
        userService.updateUserByuserId(userId, user);
    }
}
