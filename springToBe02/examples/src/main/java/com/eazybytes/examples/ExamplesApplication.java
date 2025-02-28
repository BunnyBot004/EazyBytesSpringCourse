package com.eazybytes.examples;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eazybytes.examples.beans.Vehicle;
import com.eazybytes.examples.config.ProjectConfig;

@SpringBootApplication
public class ExamplesApplication {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Honda City");
		System.out.println("\nVehicle name for non-Spring context is: " + vehicle.getName());

		// Application Context is one of the 2 IoC Container Interfaces (alongside BeanFactory)
		// We use this to create an instance of a class (AnnotationConfigApplicationContext) that can scan the project for its Beans
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle beanVehicle = context.getBean(Vehicle.class);
		System.out.println("Vehicle from Spring context ist: " + beanVehicle.getName());

		String beanString = context.getBean(String.class);
		Integer beanInteger = context.getBean(Integer.class);
		System.out.println("beanString: " + beanString);
		System.out.println("beanInteger: " + beanInteger);

		// Run not necessary currently as we will not be making a web app yet
		//SpringApplication.run(ExamplesApplication.class, args);
	}

}
