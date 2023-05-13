package com.example.bigmac;
public class Pasta extends MenuItem {
    
    private String name;
    private String type;
    private double price;
    
    public Pasta(String name, String type, double price) {
        super(name);
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getPrice() {
        double price = super.getPrice();
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nPrice: $" + price;
    }
}
