package com.example.javacourse.home_work_01.config;

import com.example.javacourse.home_work_01.car_components.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigEngine {
    @Bean
    public Engine getEngine(){
        return new Engine();
    }
}
