package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
         String[] persons   = context.getBeanNamesForType(Person.class);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);

        }
         Person person =context.getBean(Person.class);
         person.getVehicle().getVehicleService().moveVehicle();
         String[] name =context.getBeanNamesForType(Vehicle.class);
         Vehicle vehicle = context.getBean(Vehicle.class);
         //vehicle.getVehicleService().playMusic();
        // vehicle.getVehicleService().playMusic();

    }
}
