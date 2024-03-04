package com.example.javacourse.HomeWork01.Components;

import org.springframework.context.annotation.Bean;



public class SlowEngine extends Engine {
    private Engine regularEngine;

   @Bean
    public SlowEngine getSlowEngine(){
        return new SlowEngine();
    }
}
