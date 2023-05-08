package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {
//some more test will be added one these are aggreed
    @Test
    void getThePriceoftheBurgerwitheverythingB() {
         var AllinoneBurger = new Burger("All in One Burger(Beef)",
                 "Beef", "bread",true, true,
                 true, true, true, true,
                 true, true);// A burger item Beef
        assertEquals(5.5,AllinoneBurger.getPrice());
    }
    @Test
    void getThePriceoftheBurgerwitheverythingC() {
        var AllinoneBurger = new Burger("All in One Burger(Beef)",
                "Chicken", "bread",true, true,
                true, true, true, true,
                true, true);// A burger item Chicken
        assertEquals(6,AllinoneBurger.getPrice());
    }
    @Test
    void getThePriceoftheBurgerwitheverythingV() {
        var AllinoneBurger = new Burger("All in One Burger(Beef)",
                "Veggie", "bread",true, true,
                true, true, true, true,
                true, true);// A burger item Veggie
        assertEquals(5,AllinoneBurger.getPrice());
    }
    @Test
    void testGetPriceWithNoToppings() {
        Burger burger = new Burger("Basic Burger", "Beef", "Bun", false, false, false, false, false, false, false, false);
        assertEquals(4, burger.getPrice());
    }

    @Test
    void testGetPriceWithLettuceAndTomato() {
        Burger burger = new Burger("Burger with Lettuce and Tomato", "Beef", "Bun", false, false, true, true, false, false, false, false);
        assertEquals(4.6, burger.getPrice());
    }

    @Test
    void testGetPriceWithCheeseAndBacon() {
        Burger burger = new Burger("Cheeseburger with Bacon", "Beef", "Bun", true, false, false, false, false, true, false, false);
        assertEquals(4.5, burger.getPrice());
    }

    @Test
    void testGetPriceWithAllToppings() {
        Burger burger = new Burger("Burger with All Toppings", "Beef", "Bun", true, true, true, true, true, true, true, true);
        assertEquals(5.5, burger.getPrice());
    }

    @Test
    void testGetPriceWithDifferentTypesOfMeat() {
        Burger beefBurger = new Burger("Beef Burger", "Beef", "Bun", true, true, true, false, false, false, false, false);
        assertEquals(5, beefBurger.getPrice());

        Burger chickenBurger = new Burger("Chicken Burger", "Chicken", "Bun", true, false, false, true, false, false, false, false);
        assertEquals(5.3, chickenBurger.getPrice());

        Burger veggieBurger = new Burger("Veggie Burger", "Veggie", "Bun", true, true, false, false, true, true, false, false);
        assertEquals(4.4, veggieBurger.getPrice());
    }

}