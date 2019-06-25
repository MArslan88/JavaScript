package com.example.order;

public class Flavour {
    private String flavourOfPizza;

    public Flavour() {
    }

    public Flavour(String flavourOfPizza) {
        this.flavourOfPizza = flavourOfPizza;
    }

    public String getFlavourOfPizza() {
        return flavourOfPizza;
    }

    public void setFlavourOfPizza(String flavourOfPizza) {
        this.flavourOfPizza = flavourOfPizza;
    }
}
