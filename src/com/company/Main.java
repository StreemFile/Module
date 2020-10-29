package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<BeerPurchase> bottleBeerPurchases = new ArrayList<>(
                Arrays.asList(
                        BeerPurchaseFactory.createBottleBeerPurchase("Львівське", 30, 1),
                        BeerPurchaseFactory.createBottleBeerPurchase("Carlsberg", 43, 4),
                        BeerPurchaseFactory.createBottleBeerPurchase("Балтика",37,4)
                        )
        );
        List<BeerPurchase> draftBeerPurchases = new ArrayList<>(
                Arrays.asList(
                        BeerPurchaseFactory.createDraftBeerPurchase(10,4),
                        BeerPurchaseFactory.createDraftBeerPurchase(14,2.5)
                )
        );
	    List<BeerPurchase> beerPurchases = new ArrayList<>();
	    beerPurchases.addAll(bottleBeerPurchases);
	    beerPurchases.addAll(draftBeerPurchases);


	    double sum = beerPurchases.stream()
                .mapToDouble(item -> item.getPrice()).sum();
        System.out.println("Сума: " + sum);
        double min = beerPurchases.stream()
                .mapToDouble(item -> item.getPrice()).min().orElse(0);
        System.out.println("Мінімальна покупка: " + min);
        double max = beerPurchases.stream()
                .mapToDouble(item -> item.getPrice()).max().orElse(0);
        System.out.println("Максимальна покука: " + max);
        double average = beerPurchases.stream()
                .mapToDouble(item -> item.getPrice()).average().orElse(0);
        System.out.println("Середня ціна покупки: " + average);

        double bottleMax = bottleBeerPurchases.stream()
                .mapToDouble(item -> item.getPrice()).sum();

        double draftMax = draftBeerPurchases.stream()
                .mapToDouble(item -> item.getPrice()).sum();

        System.out.println(bottleMax > draftMax ?
                "Продавати пиво в бутилках вигідніше."
                : "Продавати розливне пиво вигідніше.");
    }
}
