package com.example.ecommerce;

import com.example.ecommerce.entity.User;
import com.example.ecommerce.repository.UserRepository;
import com.example.ecommerce.service.UserService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    /*@Test
    @Transactional
    public void testRegisterUser() {
        //Given
        String username = "user1";
        String password = "password";
        String email = "test@test.com";

        User user = new User(username, password, email);
        User registeredUser = userService.registerUser(user);

        assertNotNull(registeredUser.getId());
        assertEquals(username, registeredUser.getUsername());
        assertEquals(email, registeredUser.getEmail());

        assertNotEquals(password, registeredUser.getPassword());
        assertTrue(passwordEncoder.matches(password, registeredUser.getPassword()));

        userRepository.delete(registeredUser);
    }*/

}
