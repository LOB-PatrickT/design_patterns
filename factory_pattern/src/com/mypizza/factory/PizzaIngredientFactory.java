package com.mypizza.factory;

import com.mypizza.ingredient.*;

/**
 * Created by Patrick on 4/12/2017.
 */
public interface PizzaIngredientFactory {

    public Cheese createCheese();
    public Clams createClams();
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Beef createBeef();
}
