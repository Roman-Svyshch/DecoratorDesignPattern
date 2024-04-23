package org.example.pizzaOrderingService.decorator;

import org.example.pizzaOrderingService.interfacePizza.Pizza;

public class PizzaDecorator implements Pizza {
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double price() {
        return pizza.price();
    }
}
