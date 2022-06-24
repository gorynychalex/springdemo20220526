package ru.javalang.springdemo20220526.repository.statistic;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javalang.springdemo20220526.model.statistic.QuizResult;

public interface QuizResultRepository extends JpaRepository<QuizResult,Long> {
}
