package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Vehicle;

@Configuration
public class Config {
    
    // Bean named "vehicle1"
    @Bean(name = "vehicle01")
    public Vehicle vehicle01() {
        return new Vehicle("Vehicle One", 2023);
    }

    // Bean named "vehicle2"
    @Bean(name = "vehicle02")
    public Vehicle vehicle02() {
        return new Vehicle("Vehicle Two", 2024);
    }
}
