package com.example.bigmac;

public class Drink {
    String name;
    double price;
    boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
