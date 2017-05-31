package com.mypizza.action;

import com.mypizza.pizza.Pizza;
import com.mypizza.stores.NYStylePizzaStore;
import com.mypizza.stores.PizzaStore;

/**
 * Created by Patrick on 4/8/2017.
 */
public class OperatePizzaStore {
    public static void main(String ...args) {
        PizzaStore store1 = new NYStylePizzaStore();
        Pizza pizza = store1.createPizza("cheese");

        System.out.println("Patrick ordered a " + pizza.getName());
    }
}
