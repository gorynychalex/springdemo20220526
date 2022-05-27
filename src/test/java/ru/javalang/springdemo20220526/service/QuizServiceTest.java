package ru.javalang.springdemo20220526.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.javalang.springdemo20220526.model.Quiz;
import ru.javalang.springdemo20220526.repository.QuizRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class QuizServiceTest {

    @MockBean
    private QuizRepository quizRepository;

    @Autowired
    QuizService quizService;

    @Test
    void initTest() {

        Quiz quiz = new Quiz("test");
        given(quizRepository.save(quiz)).willReturn(quiz);
        assertNotNull(quizService);
    }
}