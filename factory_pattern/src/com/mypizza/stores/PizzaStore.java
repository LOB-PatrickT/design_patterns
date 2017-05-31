package com.mypizza.stores;

import com.mypizza.pizza.Pizza;

/**
 * Created by Patrick on 4/8/2017.
 */
public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);
}
