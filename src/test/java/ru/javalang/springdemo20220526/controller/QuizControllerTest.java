package ru.javalang.springdemo20220526.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ru.javalang.springdemo20220526.data.QuizData;
import ru.javalang.springdemo20220526.model.Quiz;
import ru.javalang.springdemo20220526.repository.QuizRepository;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class QuizControllerTest {

    @MockBean
    private QuizRepository quizRepository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testReturn200() throws Exception {
        given(quizRepository.findAll()).willReturn(QuizData.getQuizs());
        mockMvc.perform(get("/api/v1/quiz"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].name").value("Java"))
        ;
        verify(quizRepository).findAll();
    }
}