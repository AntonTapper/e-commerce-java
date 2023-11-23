package com.example.ecommerce.service;

import com.example.ecommerce.entity.User;

public interface UserService {
    User registerUser(User user);
    User getUserById(Long userId);
}
