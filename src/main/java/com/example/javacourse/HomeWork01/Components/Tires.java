package com.example.javacourse.HomeWork01.Components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Log4j2
public class Tires {
    @Bean
    public Tires giveTires(){
        return new Tires();
    }

    @PostConstruct
    public void getTiresCreationInfo(){
        log.info("Tires created");
    }

    @PreDestroy
    public void getTiresDestructionInfo(){
        log.info("Tires destructed");
    }
}
