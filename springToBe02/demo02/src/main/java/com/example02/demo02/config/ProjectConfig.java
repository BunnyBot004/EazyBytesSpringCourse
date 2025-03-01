package com.example02.demo02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example02.demo02.model.Vehicle;

@Configuration
public class ProjectConfig {
    
    //Note: Spring methods annotated with @Bean should have names that are nouns, as this is how they will apear 
    //within the Spring context when debugging
    @Bean 
    Vehicle generateVehicleBean(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Fiat Punto");
        return vehicle;
    }

    String generateStringBean(){
        return "Hello World";
    }

    @Bean
    Integer generateIntegerBean(){
        return 10;
    }
}
