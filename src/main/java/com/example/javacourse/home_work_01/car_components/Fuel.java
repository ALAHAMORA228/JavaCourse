package com.example.javacourse.home_work_01.car_components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class Fuel {
    @PostConstruct
    public void getFuelCreationInfo(){
        log.info("Fuel created");
    }

    @PreDestroy
    public void getFuelDestructionInfo(){
        log.info("Fuel destructed");
    }
}