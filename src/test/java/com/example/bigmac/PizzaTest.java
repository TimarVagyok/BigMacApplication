package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void calculatePizzaWithEverytingl() {
        var AllinOneBigPizza = new Pizza("Large",2,false);
        assertEquals(13,AllinOneBigPizza.calculatePizzaPrice());
    }
    @Test
    void calculatePizzaWithEverytingm() {
        var AllinOnePizza = new Pizza("Medium",2,false);
        assertEquals(12,AllinOnePizza.calculatePizzaPrice());
    }
    @Test
    void calculatePizzaWithEverytings() {
        var AllinOneSmallPizza = new Pizza("Small",2,false);
        assertEquals(11,AllinOneSmallPizza.calculatePizzaPrice());
    }
}