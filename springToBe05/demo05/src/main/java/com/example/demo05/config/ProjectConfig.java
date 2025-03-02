package com.example.demo05.config;

import com.example.demo05.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Note: Since @Component is being used, and @SpringBootApplication uses @ComponentScan for the entire project
//This class is technically not necessary. However, it is useful when creating non-default beans
@Configuration
@ComponentScan(basePackages = "com.example.demo05")
public class ProjectConfig {
    @Bean
    public Vehicle secretVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Secret Vehicle that should never be visible but isn't default");
        return vehicle;
    }
}
