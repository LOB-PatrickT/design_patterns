package com.mypizza.pizza;

import com.mypizza.factory.PizzaIngredientFactory;

/**
 * Created by Patrick on 4/14/2017.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setClam(pizzaIngredientFactory.createClams());
        setCheese(pizzaIngredientFactory.createCheese());
        setSauce(pizzaIngredientFactory.createSauce());
    }
}
