package org.example.pizzaOrderingService.model;

import org.example.pizzaOrderingService.decorator.PizzaDecorator;
import org.example.pizzaOrderingService.interfacePizza.Pizza;

public class AddMushrooms extends PizzaDecorator {
    public AddMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "mushrooms ,";
    }

    @Override
    public double price() {
        return super.price() + 20;
    }
}
