package com.example.demo05.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Note: will get overriden by @Bean methods if the method name is identical to class name due to Spring's Bean Definition Override Rules
@Component
@Primary
public class Vehicle {
    public Vehicle() {
        this.name = "Non-Secret Vehicle";
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}' + '\n';
    }

    public void componentDemonstration() {
        System.out.println("Component Demonstration");
    }
}
