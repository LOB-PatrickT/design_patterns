package com.adapter;

import com.adapter.impl.MallardDuck;
import com.adapter.impl.WildTurkey;

/**
 * Created by Patrick on 5/11/2017.
 */
public class TestMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        mallardDuck.fly();
        mallardDuck.quack();

        turkeyAdapter.fly();
        turkeyAdapter.quack();

        wildTurkey.gobble();
        wildTurkey.fly();
    }
}
