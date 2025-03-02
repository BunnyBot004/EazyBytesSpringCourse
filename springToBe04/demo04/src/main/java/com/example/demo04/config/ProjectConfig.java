package com.example.demo04.config;

import com.example.demo04.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "vehicleOne")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");
        return vehicle;
    }

    @Bean(value = "vehicleTwo")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");
        return vehicle;
    }

    @Bean("vehicleThree")
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");
        return vehicle;
    }
    @Bean
    @Primary
    Vehicle vehicle4(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("The Milka (TM)");
        return vehicle;
    }

}
