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
    @Test
    void calculatePizzaWithToppings() {
        var pizza = new Pizza("Medium", 3, false);
        assertEquals(12.5, pizza.calculatePizzaPrice());
    }

    @Test
    void calculatePizzaWithGlutenFreeAndToppings() {
        var pizza = new Pizza("Small", 2, true);
        assertEquals(12.5, pizza.calculatePizzaPrice());
    }

    @Test
    void calculatePizzaWithLargeSizeAndGlutenFree() {
        var pizza = new Pizza("Large", 0, true);
        assertEquals(13.5, pizza.calculatePizzaPrice());
    }

    @Test
    void calculatePizzaWithSmallSizeAndNoToppings() {
        var pizza = new Pizza("Small", 0, false);
        assertEquals(10.0, pizza.calculatePizzaPrice());
    }

}