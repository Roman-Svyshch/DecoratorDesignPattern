package org.example.pizzaOrderingService.model;

import org.example.pizzaOrderingService.interfacePizza.Pizza;

public class BasicBread implements Pizza {
    @Override
    public String getDescription() {
        return "This base of pizza . You add some ";
    }

    @Override
    public double price() {
        return 15;
    }
}
