package com.adapter;

/**
 * Created by Patrick on 5/11/2017.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
