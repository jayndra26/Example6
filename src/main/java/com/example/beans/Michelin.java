package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyre{

    @Override
    @Primary
    public String rotate() {
        System.out.println("Michelin tyres rotating");
        return null;
    }
}
