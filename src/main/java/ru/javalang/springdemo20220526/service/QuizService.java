package ru.javalang.springdemo20220526.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javalang.springdemo20220526.data.QuizData;
import ru.javalang.springdemo20220526.model.Quiz;
import ru.javalang.springdemo20220526.model.statistic.QuizResult;
import ru.javalang.springdemo20220526.repository.OptionRepository;
import ru.javalang.springdemo20220526.repository.QuestionRepository;
import ru.javalang.springdemo20220526.repository.QuizRepository;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;



    @PostConstruct
    public void init(){

        // Collect one quiz
        QuizData.getQuizs().forEach(
                quiz -> {
                    quiz.getQuestionList().forEach(question -> {
                        question.getOptions().forEach(optionRepository::save);
                        questionRepository.save(question);
                    });
                    quizRepository.save(quiz);
                }
        );
    }

    public void saveResult(QuizResult quizResult){

    }
}
