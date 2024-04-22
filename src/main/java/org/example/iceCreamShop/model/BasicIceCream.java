package org.example.iceCreamShop.model;

import org.example.iceCreamShop.interfaces.IceCream;

public class BasicIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Basic ice cream ";
    }

    @Override
    public double cost() {
        return 25;
    }
}
