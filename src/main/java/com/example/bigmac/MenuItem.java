package com.example.bigmac;

public abstract class MenuItem {
    public static String name;
    public double price;

    public MenuItem(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
