package com.example.javacourse.home_work_04.config.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;

@Getter
@Setter
@ConfigurationProperties(prefix="not-cool-app")
public class AppProp {
    private String name;
    private ArrayList<Integer> values;
    private String envVar;
}
