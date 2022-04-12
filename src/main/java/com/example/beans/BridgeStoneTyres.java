package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyre {

    @Override
    public String rotate() {
        System.out.println("BridgeStoneTyres rotating");
        return "";
    }
}
