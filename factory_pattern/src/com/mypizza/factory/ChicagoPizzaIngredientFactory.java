package com.mypizza.factory;

import com.mypizza.ingredient.*;

/**
 * Created by Patrick on 4/14/2017.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new WhiteSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Tomato()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Beef createBeef() {
        return new GroundBeef();
    }
}
