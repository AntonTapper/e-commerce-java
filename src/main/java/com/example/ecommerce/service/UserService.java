package com.example.ecommerce.service;

import com.example.ecommerce.dto.UserDTO;
import com.example.ecommerce.entity.User;


public interface UserService {
    User registerUser(UserDTO userDTO);
    User getUserByUsername(String username);
}
