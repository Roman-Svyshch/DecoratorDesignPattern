package org.example.iceCreamShop.model;

import org.example.iceCreamShop.decorator.IceCreamDecorator;
import org.example.iceCreamShop.interfaces.IceCream;

public class VanillaTopping extends IceCreamDecorator {
    public VanillaTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with vanilla topping ";
    }

    @Override
    public double cost() {
        return super.cost() + 13;
    }
}
