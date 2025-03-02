package com.example.demo05;

import com.example.demo05.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo05Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context1 = SpringApplication.run(Demo05Application.class, args);
//        var context = new AnnotationConfigApplicationContext(Demo05Application.class);
        Vehicle bean = context1.getBean(Vehicle.class);
        bean.componentDemonstration();
        System.out.println(bean.getName());
    }

}
