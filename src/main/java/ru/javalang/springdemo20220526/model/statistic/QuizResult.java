package ru.javalang.springdemo20220526.model.statistic;

import ru.javalang.springdemo20220526.model.Quiz;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class QuizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    Quiz quiz;

    @OneToMany
    List<QuestionResult> questionResults;

    LocalDateTime dateTimeStart;

    LocalDateTime dateTimeStop;

    public QuizResult() {
    }

    public QuizResult(Quiz quiz){this.quiz = quiz;}

    public QuizResult(Quiz quiz, List<QuestionResult> questionResults) {
        this(quiz);
        this.questionResults = questionResults;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<QuestionResult> getQuestionResults() {
        return questionResults;
    }

    public void setQuestionResults(List<QuestionResult> questionResults) {
        this.questionResults = questionResults;
    }

    public LocalDateTime getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(LocalDateTime dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    public LocalDateTime getDateTimeStop() {
        return dateTimeStop;
    }

    public void setDateTimeStop(LocalDateTime dateTimeStop) {
        this.dateTimeStop = dateTimeStop;
    }
}
