package com.pro.user.controllers;

import com.pro.user.entities.User;
import com.pro.user.services.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return  userService.saveUser(user);
    }
    @GetMapping("/user/{id}")
    public  User getUserById(@PathVariable int id){
        return  userService.getUserById(id);
    }
}
