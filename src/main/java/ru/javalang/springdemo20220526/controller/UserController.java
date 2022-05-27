package ru.javalang.springdemo20220526.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javalang.springdemo20220526.model.User;
import ru.javalang.springdemo20220526.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> userList(){
        return userRepository.findAll();
    }

}
