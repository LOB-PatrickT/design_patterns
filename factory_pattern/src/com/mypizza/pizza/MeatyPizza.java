package com.mypizza.pizza;

import com.mypizza.factory.PizzaIngredientFactory;
import com.mypizza.ingredient.Garlic;
import com.mypizza.ingredient.Onion;
import com.mypizza.ingredient.Tomato;
import com.mypizza.ingredient.Veggies;

/**
 * Created by Patrick on 4/15/2017.
 */
public class MeatyPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public MeatyPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setPepperoni(pizzaIngredientFactory.createPepperoni());
        setSauce(pizzaIngredientFactory.createSauce());
        setBeef(pizzaIngredientFactory.createBeef());
    }
}
