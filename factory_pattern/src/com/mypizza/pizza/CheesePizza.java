package com.mypizza.pizza;

import com.mypizza.factory.PizzaIngredientFactory;

/**
 * Created by Patrick on 4/14/2017.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setPepperoni(pizzaIngredientFactory.createPepperoni());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
    }
}
