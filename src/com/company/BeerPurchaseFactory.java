package com.company;

/**
 * Created by IntelliJ IDEA.
 * Module.BeerPurchaseFactory
 *
 * @Autor: vovamv
 * @DateTime: 10/29/20|2:42 пп
 * @Version BeerPurchaseFactory: 1.0
 */

public class BeerPurchaseFactory {
    public static BeerPurchase createBottleBeerPurchase(String name, double price, int numberOfBottles){
        return new BottleBeerPurchase(name,price,numberOfBottles);
    }
    public static BeerPurchase createDraftBeerPurchase(double price, double numberOfLiters){
        return new DraftBeerPurchase(price, numberOfLiters);
    }
}
