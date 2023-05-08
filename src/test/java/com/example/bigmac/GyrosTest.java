package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GyrosTest {

    @Test
    void testCalculatePriceChickenGyroWithAllToppings() {
        var AllinoneGyros = new Gyros("Chicken",true,true,true,true);
        assertEquals(8,AllinoneGyros.calculatePrice());
    }
    @Test
    void testCalculatePriceBeefGyroWithAllToppings() {
        var AllinoneGyros = new Gyros("Beef",true,true,true,true);
        assertEquals(9.5,AllinoneGyros.calculatePrice());
    }
    @Test
    void testCalculatePriceLambGyroWithAllToppings() {
        var AllinoneGyros = new Gyros("Lamb",true,true,true,true);
        assertEquals(9,AllinoneGyros.calculatePrice());
    }
    @Test
    public void testCalculatePriceChickenGyroWithNoToppings() {
        Gyros chickenGyro = new Gyros("Chicken", false, false, false, false);
        assertEquals(6.0, chickenGyro.calculatePrice());
    }

    @Test
    public void testCalculatePriceBeefGyroWithOnlyTomatoes() {
        Gyros beefGyro = new Gyros("Beef", true, false, false, false);
        assertEquals(8.0, beefGyro.calculatePrice());
    }
    @Test
    public void testCalculatePriceOnlyTomatoes() {
        Gyros beefGyro = new Gyros("Beef", true, false, false, false);
        assertEquals(8, beefGyro.calculatePrice());
    }
    @Test
    public void testCalculatePriceOnlyOnions() {
        Gyros beefGyro = new Gyros("Beef", false, true, false, false);
        assertEquals(8.0, beefGyro.calculatePrice());
    }
    @Test
    public void testCalculatePriceOnlyTzatziki() {
        Gyros beefGyro = new Gyros("Beef", false, false, false, true);
        assertEquals(8.2, beefGyro.calculatePrice());
    }
    @Test
    public void testCalculatePriceLambGyro() {
        Gyros lambGyro = new Gyros("Lamb", false, false, false, false);
        assertEquals(7, lambGyro.calculatePrice());
    }
    @Test
    public void testCalculatePriceOnlyLettuce() {
        Gyros beefGyro = new Gyros("Beef", false, false, true, false);
        assertEquals(7.8, beefGyro.calculatePrice());
    }

}