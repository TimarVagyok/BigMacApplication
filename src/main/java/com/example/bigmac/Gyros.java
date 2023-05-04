package com.example.bigmac;

public class Gyros {
    String meat;
    boolean hasTomatoes;
    boolean hasOnions;
    boolean hasLettuce;
    boolean hasTzatziki;
    double price;

    public Gyros(String meat, boolean hasTomatoes, boolean hasOnions, boolean hasLettuce, boolean hasTzatziki) {
        this.meat = meat;
        this.hasTomatoes = hasTomatoes;
        this.hasOnions = hasOnions;
        this.hasLettuce = hasLettuce;
        this.hasTzatziki = hasTzatziki;
        this.price = calculatePrice();
    }

    public double calculatePrice() {
        double basePrice = 5.0;
        double meatPrice = 0.0;
        if (meat.equals("Chicken")) {
            meatPrice = 1.0;
        } else if (meat.equals("Lamb")) {
            meatPrice = 2.0;
        } else if (meat.equals("Beef")) {
            meatPrice = 2.5;
        }
        double toppingsPrice = 0.0;
        if (hasTomatoes) {
            toppingsPrice += 0.5;
        }
        if (hasOnions) {
            toppingsPrice += 0.5;
        }
        if (hasLettuce) {
            toppingsPrice += 0.3;
        }
        if (hasTzatziki) {
            toppingsPrice += 0.7;
        }
        return basePrice + meatPrice + toppingsPrice;
    }

    public String getMeat() {
        return meat;
    }

    public boolean hasTomatoes() {
        return hasTomatoes;
    }

    public boolean hasOnions() {
        return hasOnions;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasTzatziki() {
        return hasTzatziki;
    }

    public double getPrice() {
        return price;
    }
}
