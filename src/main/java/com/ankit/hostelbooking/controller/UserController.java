package com.ankit.hostelbooking.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.ankit.hostelbooking.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.ankit.hostelbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/login")
    public User login(@RequestParam String email,
                      @RequestParam String password) {

        return userService.login(email, password);
    }
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Integer id,
                           @RequestBody User user) {

        return userService.updateUser(id, user);
    }

}