package com.mypizza.pizza;

import com.mypizza.factory.PizzaIngredientFactory;
import com.mypizza.ingredient.Garlic;
import com.mypizza.ingredient.Onion;
import com.mypizza.ingredient.Tomato;
import com.mypizza.ingredient.Veggies;

/**
 * Created by Patrick on 4/14/2017.
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setPepperoni(pizzaIngredientFactory.createPepperoni());
        setSauce(pizzaIngredientFactory.createSauce());
        setVeggies(new Veggies[]{new Onion(),new Garlic(), new Tomato()});
    }
}
