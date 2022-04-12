package com.example.config;


import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class,com.example.beans.Person.class})
public class ProjectConfig {

//    @Bean
//    Vehicle vehicle1(){
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.setName("Audi");
//        return vehicle1;
//
//    }
//
//    @Bean
//    Vehicle vehicle2(){
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.setName("Honda");
//        return vehicle2;
//
//    }
//    @Bean
//    Vehicle vehicle3(){
//        Vehicle vehicle3 = new Vehicle();
//        vehicle3.setName("Ferrari");
//        return vehicle3 ;

    }



