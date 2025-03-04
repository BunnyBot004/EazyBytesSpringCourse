package com.example02.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example02.demo02.config.ProjectConfig;
import com.example02.demo02.model.Vehicle;

@SpringBootApplication
public class Demo02Application {

	public static void main(String[] args) {
		//Bootstrap the primary Spring Boot application context
        ApplicationContext context = SpringApplication.run(Demo02Application.class, args);
        //Create an additional manual configuration context
        var otherContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Lamborghini Aventador");
		System.out.println("Vehicle name of non-IoC object: " + vehicle.getName());

		//Used when you want the default autoconfiguration methodologies to apply
		Vehicle vehicle2 = context.getBean(Vehicle.class);
		System.out.println("Vehicle name of IoC object: " + vehicle2.getName());

		//Used when you want an application context that is configured manually via a Java-based configuration file (ProjectConfig).
		Vehicle vehicle3 = otherContext.getBean(Vehicle.class);
		System.out.println("Vehicle name of IoC using manual config context: " + vehicle2.getName());

		/*NOTE: Beans in each context are managed independently. If the same bean is defined in both contexts, you will have two separate instances of that bean. */
	
	}

}
