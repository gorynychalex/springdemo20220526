package ru.javalang.springdemo20220526.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javalang.springdemo20220526.model.Option;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
