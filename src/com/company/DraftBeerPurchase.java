package com.company;

/**
 * Created by IntelliJ IDEA.
 * Module.DraftBeer
 *
 * @Autor: vovamv
 * @DateTime: 10/29/20|2:18 пп
 * @Version DraftBeer: 1.0
 */

public class DraftBeerPurchase implements BeerPurchase{
    double priceForLiter;
    double numberOfLiters;

    public DraftBeerPurchase() {
    }

    public DraftBeerPurchase(double priceForLiter, double numberOfLiters) {
        this.priceForLiter = priceForLiter;
        this.numberOfLiters = numberOfLiters;
    }

    public double getPriceForLiter() {
        return priceForLiter;
    }

    public void setPriceForLiter(double priceForLiter) {
        this.priceForLiter = priceForLiter;
    }

    public double getNumberOfLiters() {
        return numberOfLiters;
    }

    public void setNumberOfLiters(double numberOfLiters) {
        this.numberOfLiters = numberOfLiters;
    }

    @Override
    public double getPrice() {
        return this.getPriceForLiter()*this.getNumberOfLiters();
    }

    @Override
    public String toString() {
        return "DraftBeerPurchase{" +
                "priceForLiter=" + priceForLiter +
                ", numberOfLiters=" + numberOfLiters +
                '}';
    }
}
