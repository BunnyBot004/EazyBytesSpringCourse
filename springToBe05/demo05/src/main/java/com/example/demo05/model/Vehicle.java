package com.example.demo05.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
        System.out.println("Demonstration of Component");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct of Component: " + toString());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy of Component: " + toString());
    }
}
