package com.example.javacourse.home_work_01.config;

import com.example.javacourse.home_work_01.car_components.Tires;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTires {
    @Bean
    public Tires getTires(){
        return new Tires();
    }
}
