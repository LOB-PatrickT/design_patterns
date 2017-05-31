package com.mypizza.stores;

import com.mypizza.factory.ChicagoPizzaIngredientFactory;
import com.mypizza.factory.PizzaIngredientFactory;
import com.mypizza.pizza.*;

/**
 * Created by Patrick on 4/8/2017.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        }
        if(item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        }
        if(item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
