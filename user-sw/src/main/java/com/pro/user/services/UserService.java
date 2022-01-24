package com.pro.user.services;

import com.pro.user.entities.User;
import com.pro.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository ) {
        this.userRepository = userRepository;
    }
    public  User saveUser(User user){
        return  userRepository.save(user);
    }
    public User getUserById(Integer id){
        return  userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
    }
}
