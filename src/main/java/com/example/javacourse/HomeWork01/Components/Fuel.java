package com.example.javacourse.HomeWork01.Components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class Fuel {
    @Bean
    public Fuel giveFuel(){
        return new Fuel();
    }

    @PostConstruct
    public void getFuelCreationInfo(){
        log.info("Fuel created");
    }

    @PreDestroy
    public void getFuelDestructionInfo(){
        log.info("Fuel destructed");
    }
}
