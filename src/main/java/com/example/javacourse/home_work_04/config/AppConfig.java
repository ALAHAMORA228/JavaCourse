package com.example.javacourse.home_work_04.config;

import com.example.javacourse.home_work_04.config.properties.AppProp;
import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(AppProp.class)
@Configuration
@Log4j2
public class AppConfig {
    AppProp properties;

    @Bean
    @Profile("test")
    @PostConstruct
    public void getTestInfo(){
        log.info(properties.getName());
    }

    @Bean
    @Profile("dev")
    @PostConstruct
    public void getDevInfo(){
        log.info(properties.getName());
    }

    @Bean
    @Profile("prod")
    @PostConstruct
    public void getProdInfo(){
        log.info(properties.getName());
    }
}
