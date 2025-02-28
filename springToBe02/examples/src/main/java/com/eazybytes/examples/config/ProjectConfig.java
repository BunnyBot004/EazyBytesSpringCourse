package com.eazybytes.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eazybytes.examples.beans.Vehicle;

@Configuration  // IoC Container will scan all the contents of this class
public class ProjectConfig {

    @Bean   // Something (like a POJO) to be managed by the IoC Container
    Vehicle getVehicleBean(){
        var vehicle = new Vehicle();
        vehicle.setName("Fiat Punto");
        return vehicle;
    }

    @Bean
    String helloString(){
        return "Hello World";
    }

    @Bean
    Integer numInteger(){
        return 42;
    }
    
}
