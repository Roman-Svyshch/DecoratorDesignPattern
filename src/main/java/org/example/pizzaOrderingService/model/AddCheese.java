package org.example.pizzaOrderingService.model;

import org.example.pizzaOrderingService.decorator.PizzaDecorator;
import org.example.pizzaOrderingService.interfacePizza.Pizza;

public class AddCheese extends PizzaDecorator {
    public AddCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "cheese :";
    }

    @Override
    public double price() {
        return super.price() + 25;
    }
}
