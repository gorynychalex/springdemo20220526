package ru.javalang.springdemo20220526.model.statistic;

import ru.javalang.springdemo20220526.model.Question;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class QuestionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    Question question;

    @OneToMany
    List<OptionResult> optionResultList;

    LocalDateTime dateTimeStart;

    LocalDateTime dateTimeStop;

    public QuestionResult() {
    }

    public QuestionResult(Question question, List<OptionResult> optionResultList) {
        this.question = question;
        this.optionResultList = optionResultList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<OptionResult> getOptionResultList() {
        return optionResultList;
    }

    public void setOptionResultList(List<OptionResult> optionResultList) {
        this.optionResultList = optionResultList;
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
