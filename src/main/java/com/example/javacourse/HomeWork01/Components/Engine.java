package com.example.javacourse.HomeWork01.Components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class Engine {
    @Bean
    public Engine getEngine(){
        return new Engine();
    }

    @PostConstruct
    public void getEngineCreationInfo(){
        log.info("Engine created");
    }

    @PreDestroy
    public void getEngineDestructionInfo(){
        log.info("Engine destructed");
    }
}
