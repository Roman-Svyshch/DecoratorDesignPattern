package org.example.pizzaOrderingService.model;

import org.example.pizzaOrderingService.decorator.PizzaDecorator;
import org.example.pizzaOrderingService.interfacePizza.Pizza;

public class AddSalami extends PizzaDecorator {
    public AddSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "salami ,";
    }

    @Override
    public double price() {
        return super.price() + 35;
    }
}
