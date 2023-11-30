package com.example.ecommerce.service;

import com.example.ecommerce.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User getUserById(Long userId);

    List<User> getAllUsers();

    void deleteUser(Long userId);

    User updateUser(User updateUser);
}
