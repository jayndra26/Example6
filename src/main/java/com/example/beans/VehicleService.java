package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    @Autowired
    private Speaker speaker;
    @Autowired
    private Tyre tyre;

    public void playMusic() {
        String music;
        music = speaker.makeSound();
        System.out.println(music);

    }
    public void moveVehicle(){
        String status=tyre.rotate();
        System.out.println(status);
    }
}
