package ru.javalang.springdemo20220526.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

    @OneToMany
    List<Question> questionList;

    public Quiz() {
    }

    public Quiz(String name) {
        this.name = name;
    }

    public Quiz(String name, List<Question> questionList) {
        this.name = name;
        this.questionList = questionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

}
