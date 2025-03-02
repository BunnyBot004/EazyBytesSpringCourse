package com.example.demo04;

import com.example.demo04.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo04Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo04Application.class, args);

        // The class given after the Bean is so that it signifies the return type, which cannot be inferred
        // The reason it cannot be inferred is that the Spring IoC Container is called during compile time and run time
        Vehicle vehicleOne = context.getBean("vehicleOne", Vehicle.class);
        Vehicle vehicleTwo = context.getBean("vehicleTwo", Vehicle.class);
        Vehicle vehicleThree = context.getBean("vehicleThree", Vehicle.class);
        // Meanwhile, due to this being the @Primary Bean, we can just get it as it is the "default" for its class
        Vehicle primaryVehicle = context.getBean(Vehicle.class);
        System.out.println("" + vehicleOne + vehicleTwo + vehicleThree);
        System.out.println("The primary vehicle is " + primaryVehicle);

    }

}
