package com.example.bigmac;

public class Pasta {
    String name;
    String meat;
    PastaType PastaType;
    boolean hascheese;
    boolean hasseafood;
    boolean hasbacon;
    boolean hastomato;
    boolean hassalami;

    public Pasta(String name, String meat, com.example.bigmac.PastaType pastaType, boolean hascheese, boolean hasseafood, boolean hasbacon, boolean hastomato, boolean hassalami) {
        this.name = name;
        this.meat = meat;
        PastaType = pastaType;
        this.hascheese = hascheese;
        this.hasseafood = hasseafood;
        this.hasbacon = hasbacon;
        this.hastomato = hastomato;
        this.hassalami = hassalami;
    }
    //getter and setter

    public String getName() {
        return name;
    }


    public String getMeat() {
        return meat;
    }


    public com.example.bigmac.PastaType getPastaType() {
        return PastaType;
    }


    public boolean isHascheese() {
        return hascheese;
    }


    public boolean isHasseafood() {
        return hasseafood;
    }


    public boolean isHasbacon() {
        return hasbacon;
    }


    public boolean isHastomato() {
        return hastomato;
    }


    public boolean isHassalami() {
        return hassalami;
    }

    public void setHassalami(boolean hassalami) {
        this.hassalami = hassalami;
    }
    //calculate price
    public double calculatePastaPrice() {
        double basePrice = 5.0;
        double meatPrice = 0.0;
        if (meat.equals("Chicken")) {
            meatPrice = 1.0;
        } else if (meat.equals("Lamb")) {
            meatPrice = 2.0;
        } else if (meat.equals("Beef")) {
            meatPrice = 2.5;
        }
        double additionalPrice = 0.0;
        if (hascheese) {
            additionalPrice += 0.5;
        }
        if (hasseafood) {
            additionalPrice += 2.0;
        }
        if (hasbacon) {
            additionalPrice += 0.5;
        }
        if (hassalami) {
            additionalPrice += 0.3;
        }
        if (hastomato) {
            additionalPrice += 0.3;
        }
        return basePrice + meatPrice + additionalPrice;
    }

}
