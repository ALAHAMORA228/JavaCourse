package com.example.javacourse.home_work_01.car_components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class Tires {
    @PostConstruct
    public void getTiresCreationInfo(){
        log.info("Tires created");
    }

    @PreDestroy
    public void getTiresDestructionInfo(){
        log.info("Tires destructed");
    }
}
