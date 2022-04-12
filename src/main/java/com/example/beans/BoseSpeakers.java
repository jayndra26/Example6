package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker{

    @Override
    public String makeSound() {

        return "Bose sound";
    }
}
