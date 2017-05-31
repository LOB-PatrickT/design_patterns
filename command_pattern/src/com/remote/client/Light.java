package com.remote.client;

/**
 * Created by Patrick on 4/24/2017.
 */
public class Light {

    String lightLocation;

    public Light(String lightLocation) {
        this.lightLocation = lightLocation;
    }

    public void on() {
        System.out.println("Turn on light");
    }

    public void off() {
        System.out.println("Turn off light");
    }

    public String toString() {
        return lightLocation;
    }
}
