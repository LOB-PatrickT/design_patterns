package com.adapter.impl;

import com.adapter.Duck;

/**
 * Created by Patrick on 5/11/2017.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("I'm flying!");
    }
}
