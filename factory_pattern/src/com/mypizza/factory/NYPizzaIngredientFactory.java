package com.mypizza.factory;

import com.mypizza.ingredient.*;

/**
 * Created by Patrick on 4/12/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Tomato(), new Garlic()};
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
