package com.example.javacourse.home_work_01.car_components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class SlowEngine extends Engine {
    @PostConstruct
    public void getEngineCreationInfo(){
        log.info("Slow engine created");
    }

    @PreDestroy
    public void getEngineDestructionInfo(){
        log.info("Slow engine destructed");
    }
}
