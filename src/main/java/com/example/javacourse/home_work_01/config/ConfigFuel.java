package com.example.javacourse.home_work_01.config;

import com.example.javacourse.home_work_01.car_components.Fuel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFuel {
    @Bean
    public Fuel getFuel(){
        return new Fuel();
    }
}
