package com.example.javacourse.home_work_01.config;

import com.example.javacourse.home_work_01.car_components.FastEngine;
import com.example.javacourse.home_work_01.car_components.SlowEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigEngine {
    @Bean
    public FastEngine getFastEngine(){
        return new FastEngine();
    }

    @Bean
    public SlowEngine getSlowEngine(){
        return new SlowEngine();
    }
}
