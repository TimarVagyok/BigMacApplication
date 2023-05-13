package com.example.bigmac;

public class Drink extends MenuItem {
    String name;
    double price;
    boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        super(name);
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        double price = super.getPrice();
        return price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
