package com.mypizza.stores;

import com.mypizza.factory.NYPizzaIngredientFactory;
import com.mypizza.factory.PizzaIngredientFactory;
import com.mypizza.pizza.*;

/**
 * Created by Patrick on 4/8/2017.
 */
public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
            pizza.prepare();
        }
        if(item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
            pizza.prepare();
        }
        if(item.equals("meaty")) {
            pizza = new MeatyPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Meaty Pizza");
            pizza.prepare();
        }

        return pizza;
    }
}
