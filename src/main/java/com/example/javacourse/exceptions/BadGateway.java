package com.example.javacourse.exceptions;

import lombok.Getter;

@Getter
public class BadGateway extends RuntimeException{
    public BadGateway(){
        super("Server is not answering");
    }
}
