package com.company;

/**
 * Created by IntelliJ IDEA.
 * Module.BottleBeer
 *
 * @Autor: vovamv
 * @DateTime: 10/29/20|2:18 пп
 * @Version BottleBeer: 1.0
 */

public class BottleBeerPurchase implements BeerPurchase {
    String name;
    double priceForBottle;
    int numberOfBottles;

    public BottleBeerPurchase() {
    }

    public BottleBeerPurchase(String name, double priceForBottle, int numberOfBottles) {
        this.name = name;
        this.priceForBottle = priceForBottle;
        this.numberOfBottles = numberOfBottles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceForBottle() {
        return priceForBottle;
    }

    public void setPriceForBottle(double priceForBottle) {
        this.priceForBottle = priceForBottle;
    }

    public int getNumberOfBottles() {
        return numberOfBottles;
    }

    public void setNumberOfBottles(int numberOfBottles) {
        this.numberOfBottles = numberOfBottles;
    }

    @Override
    public double getPrice() {
        return this.getPriceForBottle()*this.getNumberOfBottles();
    }

    @Override
    public String toString() {
        return "BottleBeerPurchase{" +
                "name='" + name + '\'' +
                ", priceForBottle=" + priceForBottle +
                ", numberOfBottles=" + numberOfBottles +
                '}';
    }
}
