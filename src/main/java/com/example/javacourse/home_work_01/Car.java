package com.example.javacourse.home_work_01;

import com.example.javacourse.home_work_01.car_components.Engine;
import com.example.javacourse.home_work_01.car_components.Fuel;
import com.example.javacourse.home_work_01.car_components.Tires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    private Tires tires;
    @Autowired
    private Fuel fuel;

    @Autowired
    public void setTires(Tires tires){

        this.tires=tires;
    }

    public Car(@Qualifier("getEngine") Engine engine){
        this.engine=engine;
    }
}
