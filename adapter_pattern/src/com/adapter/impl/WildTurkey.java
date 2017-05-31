package com.adapter.impl;

import com.adapter.Turkey;
import com.adapter.TurkeyAdapter;

/**
 * Created by Patrick on 5/11/2017.
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    public void fly() {
        System.out.println("Fly short distance");
    }
}
