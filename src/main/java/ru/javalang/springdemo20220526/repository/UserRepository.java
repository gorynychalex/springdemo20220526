package ru.javalang.springdemo20220526.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javalang.springdemo20220526.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByLastName(String firstName);
}
