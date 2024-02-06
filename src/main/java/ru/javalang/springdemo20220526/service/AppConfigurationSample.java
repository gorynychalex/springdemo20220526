package ru.javalang.springdemo20220526.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Conditional(SampleCondition.class)
@Profile("dev")
@Configuration
public class AppConfigurationSample {

    private static final Logger log = LoggerFactory.getLogger(AppConfigurationSample.class);

    @PostConstruct
    public void init(){
        log.info("========== Application Sample loaded! ============");
    }
}
