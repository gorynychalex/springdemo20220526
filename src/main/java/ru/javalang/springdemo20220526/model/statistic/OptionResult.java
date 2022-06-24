package ru.javalang.springdemo20220526.model.statistic;

import ru.javalang.springdemo20220526.model.Option;

import javax.persistence.*;

@Entity
public class OptionResult {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    Option option;

    boolean userAnser;

    public OptionResult() {
    }

    public OptionResult(Option option, boolean userAnser) {
        this.option = option;
        this.userAnser = userAnser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public boolean isUserAnser() {
        return userAnser;
    }

    public void setUserAnser(boolean userAnser) {
        this.userAnser = userAnser;
    }
}
