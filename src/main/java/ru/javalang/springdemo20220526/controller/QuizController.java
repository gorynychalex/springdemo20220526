package ru.javalang.springdemo20220526.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javalang.springdemo20220526.data.QuizData;
import ru.javalang.springdemo20220526.model.Quiz;
import ru.javalang.springdemo20220526.repository.QuizRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping({"","/","/list"})
    public List<Quiz> quizList(){
        return quizRepository.findAll();
//        return quizRepository.findAll();
    }
}
