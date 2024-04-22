package org.example.iceCreamShop;

import org.example.iceCreamShop.interfaces.IceCream;
import org.example.iceCreamShop.model.BasicIceCream;
import org.example.iceCreamShop.model.ChocolateTopping;
import org.example.iceCreamShop.model.PistachioTopping;
import org.example.iceCreamShop.model.VanillaTopping;

public class IceCreamShopMain {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println(basicIceCream.getDescription()+ "will be cost " + basicIceCream.cost());

        System.out.println("============================================");

        IceCream chocolateIceCream = new ChocolateTopping(basicIceCream);
        System.out.println(chocolateIceCream.getDescription() +" will be cost "+ chocolateIceCream.cost());

        System.out.println("============================================");


        IceCream vanillaIceCream = new VanillaTopping(chocolateIceCream);
        System.out.println(vanillaIceCream.getDescription() + " will be cost "+ vanillaIceCream.cost());

        System.out.println("============================================");

        IceCream pistachioIceCream = new PistachioTopping(vanillaIceCream);
        System.out.println(pistachioIceCream.getDescription() + " will be cost "+ pistachioIceCream.cost());


    }
}
