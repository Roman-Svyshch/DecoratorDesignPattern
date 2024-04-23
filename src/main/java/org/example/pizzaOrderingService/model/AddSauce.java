package org.example.pizzaOrderingService.model;

import org.example.pizzaOrderingService.decorator.PizzaDecorator;
import org.example.pizzaOrderingService.interfacePizza.Pizza;

public class AddSauce  extends PizzaDecorator {
    public AddSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "sauce ,";
    }

    @Override
    public double price() {
        return super.price() + 30;
    }
}
