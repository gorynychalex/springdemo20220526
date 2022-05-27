package ru.javalang.springdemo20220526.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizDataTest {

    @Test
    void getQuizs() {
        assertNotNull(QuizData.getQuizs());
        assertTrue(QuizData.getQuizs().size() > 0);
        assertTrue(QuizData.getQuizs().get(0).getQuestionList().size() > 0);
    }
}