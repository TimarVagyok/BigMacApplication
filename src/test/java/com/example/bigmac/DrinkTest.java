package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    @Test
    void testDrinkConstructor() {
        String name = "Mojito";
        double price = 8.0;
        boolean isAlcoholic = true;
        boolean isCold = true;

        Drink drink = new Drink(name, price, isAlcoholic, isCold);

        assertEquals(name, drink.getName());
        assertEquals(price, drink.getPrice());
        assertEquals(isAlcoholic, drink.isAlcoholic());
        assertEquals(isCold, drink.isCold());
    }


}