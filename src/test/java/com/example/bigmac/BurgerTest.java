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
}