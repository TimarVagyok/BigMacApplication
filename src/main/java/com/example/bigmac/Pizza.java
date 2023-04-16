package com.example.bigmac;

public class Pizza {
     String size;
     int numToppings;
     boolean isGlutenFree;
     double price;

    public Pizza(String size, int numToppings, boolean isGlutenFree) {
        this.size = size;
        this.numToppings = numToppings;
        this.isGlutenFree = isGlutenFree;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        double basePrice = 8.0;
        double sizePrice = 0.0;
        if (size.equals("Small")) {
            sizePrice = 2.0;
        } else if (size.equals("Medium")) {
            sizePrice = 3.0;
        } else if (size.equals("Large")) {
            sizePrice = 4.0;
        }
        double toppingPrice = numToppings * 0.5;
        double glutenFreePrice = isGlutenFree ? 1.5 : 0.0;
        return basePrice + sizePrice + toppingPrice + glutenFreePrice;
    }

    public String getSize() {
        return size;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public double getPrice() {
        return price;
    }
}
