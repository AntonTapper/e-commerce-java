package com.example.ecommerce.service;

import com.example.ecommerce.dto.UserDTO;
import com.example.ecommerce.entity.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

   @Override
   public User registerUser(UserDTO userDTO) {

       if(userRepository.findByUsername(userDTO.getUsername()).isPresent() ||
               userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
           throw new RuntimeException("Username or email already exists");
       }
       /* Create a new user entity */
       User user = new User(userDTO.getUsername(), userDTO.getEmail(), userDTO.getPassword());

       String hashedPassword = passwordEncoder.encode(userDTO.getPassword());
       user.setPassword(hashedPassword);


       return userRepository.save(user);
   }


    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found with the username: " + username));
    }
}