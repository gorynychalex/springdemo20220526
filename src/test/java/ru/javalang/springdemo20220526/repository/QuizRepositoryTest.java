package ru.javalang.springdemo20220526.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.javalang.springdemo20220526.data.QuizData;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class QuizRepositoryTest {

    @Autowired
    QuizRepository quizRepository;

    @Test
    public void saveTest(){
        assertNotNull(quizRepository.save(QuizData.getQuizs().get(0)));
//        assertEquals(1,quizRepository.count());
//        assertEquals(QuizData.getQuizs().get(0),quizRepository.findByName("Java"));
    }

}