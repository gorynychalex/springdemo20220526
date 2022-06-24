package ru.javalang.springdemo20220526.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.javalang.springdemo20220526.data.QuizData;
import ru.javalang.springdemo20220526.model.Quiz;
import ru.javalang.springdemo20220526.model.statistic.OptionResult;
import ru.javalang.springdemo20220526.model.statistic.QuestionResult;
import ru.javalang.springdemo20220526.model.statistic.QuizResult;
import ru.javalang.springdemo20220526.repository.QuizRepository;
import ru.javalang.springdemo20220526.repository.statistic.QuizResultRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class QuizServiceTest {

    Random random = new Random();

    Quiz quiz;

    @MockBean
    private QuizRepository quizRepository;

    @Autowired
    QuizService quizService;

    @MockBean
    QuizResultRepository quizResultRepository;

    @BeforeEach
    void setUp(){
        quiz=QuizData.getQuizs().get(0);
    }

    @Test
    void initTest() {
        Quiz quiz = new Quiz("test");
        given(quizRepository.save(quiz)).willReturn(quiz);
        assertNotNull(quizService);
    }

    // Collect User Answers of Quiz and save
    @Test
    void saveResult(){

        QuizResult quizResult = new QuizResult(quiz);

        quizResult.setQuestionResults(new ArrayList<>());

        QuizData.getQuizs().get(0).getQuestionList()
                .forEach(q->{
                    quizResult.getQuestionResults().add(
                            new QuestionResult(q,
                                    q.getOptions().stream()
                                            .map(o->new OptionResult(o,random.nextBoolean())).toList()));
                }
        );

        quizResultRepository.save(quizResult);


    }
}