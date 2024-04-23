package org.example.pizzaOrderingService;

import org.example.pizzaOrderingService.decorator.PizzaDecorator;
import org.example.pizzaOrderingService.interfacePizza.Pizza;
import org.example.pizzaOrderingService.model.*;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza basePizza = new BasicBread();
        System.out.println(basePizza.getDescription() + " It`s will cost "+ basePizza.price());

        System.out.println("============================");


        PizzaDecorator addSalami = new AddSalami(basePizza);
        System.out.println(addSalami.getDescription() +"Total price "+ addSalami.price());

        System.out.println("============================");

        PizzaDecorator addSauce = new AddSauce(addSalami);
        System.out.println(addSauce.getDescription() +"Total price "+ addSauce.price());

        System.out.println("============================");

        PizzaDecorator addMushrooms = new AddMushrooms(addSauce);
        System.out.println(addMushrooms.getDescription() +"Total price "+ addMushrooms.price());

        System.out.println("============================");

        PizzaDecorator addCheese = new AddCheese(addMushrooms);
        System.out.println(addCheese.getDescription() +"Total price "+ addCheese.price());


    }
}
