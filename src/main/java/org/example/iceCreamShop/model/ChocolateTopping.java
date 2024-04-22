package org.example.iceCreamShop.model;

import org.example.iceCreamShop.decorator.IceCreamDecorator;
import org.example.iceCreamShop.interfaces.IceCream;

public class ChocolateTopping extends IceCreamDecorator {
    public ChocolateTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with chocolate topping ";
    }

    @Override
    public double cost() {
        return super.cost() + 10;
    }
}
