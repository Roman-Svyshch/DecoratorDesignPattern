package org.example.iceCreamShop.decorator;

import org.example.iceCreamShop.interfaces.IceCream;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public double cost() {
        return iceCream.cost();
    }
}
