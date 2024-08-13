package com.example.service;

import com.example.config.UserClient;
import com.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    private final UserClient userClient;

    public ApiService(UserClient userClient) {
        this.userClient = userClient;
    }

    public List<User> getAllUsers() {
        return userClient.getUsers();
    }
}
