package com.example.javacourse.HomeWork01.Components;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;


@Log4j2
public class FastEngine extends Engine{
    private Engine regularEngine;

    @Bean
    public FastEngine getFastEngine(){
        return new FastEngine();
    }

    @Bean
    @Override
    public void getEngineCreationInfo(){
        log.info("This is fast engine");
    }
}
