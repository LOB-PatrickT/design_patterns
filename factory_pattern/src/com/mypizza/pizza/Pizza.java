package com.mypizza.pizza;

import com.mypizza.ingredient.*;

import java.util.ArrayList;

/**
 * Created by Patrick on 4/8/2017.
 */
public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies[];
    private Pepperoni pepperoni;
    private Cheese cheese;
    private Clams clam;
    private Beef beef;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Bake for 25 mins at 350.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public Beef getBeef() {
        return beef;
    }

    public void setBeef(Beef beef) {
        this.beef = beef;
    }

    @Override
    public String toString() {
        // code to print pizza here
        return "";
    }

}
