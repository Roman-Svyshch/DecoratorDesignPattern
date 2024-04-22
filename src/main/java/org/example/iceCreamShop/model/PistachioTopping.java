package org.example.iceCreamShop.model;

import org.example.iceCreamShop.decorator.IceCreamDecorator;
import org.example.iceCreamShop.interfaces.IceCream;

public class PistachioTopping extends IceCreamDecorator {


    public PistachioTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with pistachio topping ";
    }

    @Override
    public double cost() {
        return super.cost() + 17;
    }
}
