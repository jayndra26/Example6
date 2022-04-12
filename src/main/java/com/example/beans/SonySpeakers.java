package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speaker{

    @Override

    public String makeSound() {

        return "Sony Sound ";
    }
}
