package ru.javalang.springdemo20220526.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javalang.springdemo20220526.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
    Quiz findByName(String s);
}
