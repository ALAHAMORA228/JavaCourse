package com.example.javacourse.entities;


import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class Info{
    @Setter
    private int id;
    private final Date date;
    @JsonCreator
    public Info(int id, Date date){
        this.date=date;
        this.id=id;
    }

}
