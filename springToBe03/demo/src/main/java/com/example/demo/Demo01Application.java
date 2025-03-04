package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Vehicle;

@SpringBootApplication
public class Demo01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo01Application.class, args);
		Vehicle v1 = applicationContext.getBean("vehicle01",Vehicle.class);
		Vehicle v2 = applicationContext.getBean("vehicle02",Vehicle.class);

		System.out.println("Vehicle 1: " + v1 + "\nVehicle 2: " + v2);
	}

}
