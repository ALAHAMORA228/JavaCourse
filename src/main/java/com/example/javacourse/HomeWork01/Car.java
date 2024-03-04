package com.example.javacourse.HomeWork01;

import com.example.javacourse.HomeWork01.Components.Engine;
import com.example.javacourse.HomeWork01.Components.Fuel;
import com.example.javacourse.HomeWork01.Components.Tires;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Car {


    @Qualifier("engine")
    @Autowired
    private Engine neededEngine;
    private Tires neededTires;
    private Fuel neededFuel;

    @Autowired
    public void setTires(Tires tires){

        neededTires=tires;
    }

    public Car(Engine engine){
        neededEngine=engine;
    }
}
