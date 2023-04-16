package com.example.bigmac;

public class Burger {
     String name;
     String meat;
     String bread;
     boolean cheese;
     boolean lettuce;
     boolean tomato;
     boolean onion;
     boolean pickles;
     boolean ketchup;
     boolean mustard;
     boolean mayo;

    public Burger(String name, String meat, String bread, boolean cheese, boolean lettuce, boolean tomato, boolean onion, boolean pickles, boolean ketchup, boolean mustard, boolean mayo) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.pickles = pickles;
        this.ketchup = ketchup;
        this.mustard = mustard;
        this.mayo = mayo;
    }

    // getters and setters for all the fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean hasLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean hasTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean hasOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean hasPickles() {
        return pickles;
    }

    public void setPickles(boolean pickles) {
        this.pickles = pickles;
    }

    public boolean hasKetchup() {
        return ketchup;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public boolean hasMustard() {
        return mustard;
    }

    public void setMustard(boolean mustard) {
        this.mustard = mustard;
    }

    public boolean hasMayo() {
        return mayo;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }
    // method to calculate price based on ingredients
    public double getPrice() {
        double price = 0.0;
        price += 2.5; // base price
        if (meat.equals("Beef")) {
            price += 1.5;
        } else if (meat.equals("Chicken")) {
            price += 2.0;
        } else if (meat.equals("Veggie")) {
            price += 1.0;
        }
        if (cheese) {
            price += 0.5;
        }
        if (lettuce) {
            price += 0.2;
        }
        if (tomato) {
            price += 0.3;
        }
        if (onion) {
            price += 0.3;
        }
        if (pickles) {
            price += 0.2;
        }
    return price;
    }
}
