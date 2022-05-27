package ru.javalang.springdemo20220526.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javalang.springdemo20220526.model.User;
import ru.javalang.springdemo20220526.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    List<User> userList = new ArrayList<>(){{
        add(new User("Vasya","Pupkin"));
        add(new User("Anna","Ivanova"));
        add(new User("Nikola","Sidorov"));
    }};

    @PostConstruct
    public void init(){ userList.forEach(userRepository::save); }


}
