package com.remote.client;

/**
 * Created by Patrick on 5/2/2017.
 */
public class CeilingFan {
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    public static final int OFF = 0;
    String location;
    private int speed;
    private int previousOption;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println("fan speed high");
        speed = HIGH;
    }

    public void medium() {
        System.out.println("fan speed medium");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("fan speed low");
        speed = LOW;
    }

    public void off() {
        System.out.println("fan off");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPreviousOption() {
        return previousOption;
    }

    public void setPreviousOption(int previousOption) {
        this.previousOption = previousOption;
    }
}
