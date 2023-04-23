package com.example.bigmac;

public class Drink {
    String name;
    double price;
    boolean isAlcoholic;
    boolean isCold;

    public Drink(String name, double price, boolean isAlcoholic, boolean isCold) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
        this.isCold = isCold;
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

    public boolean isCold() { return isCold;}
}
