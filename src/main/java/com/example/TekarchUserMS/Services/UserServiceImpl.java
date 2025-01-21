package com.example.TekarchUserMS.Services;


import com.example.TekarchUserMS.Models.User;
import com.example.TekarchUserMS.Services.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${DATASERVICE.URL}")
    String DATASERVICE_URL;

    @Override
    public User registerUser(User user) {
        return restTemplate.postForObject(DATASERVICE_URL,user, User.class);
    }

    @Override
    public User getUserByuserId(Long userId) {
        return restTemplate.getForObject(DATASERVICE_URL + "/" + userId, User.class);
    }

    @Override
    public void updateUserByuserId(Long userId, User user) {
        restTemplate.put(DATASERVICE_URL +"/" + userId, user);
    }
}

