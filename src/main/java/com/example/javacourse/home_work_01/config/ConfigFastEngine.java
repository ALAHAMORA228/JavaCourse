package com.example.javacourse.home_work_01.config;

import com.example.javacourse.home_work_01.car_components.FastEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFastEngine{
    @Bean
    public FastEngine getFastEngine(){
        return new FastEngine();
    }
}
