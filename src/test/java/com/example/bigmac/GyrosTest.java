package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GyrosTest {

    @Test
    void getThePriceofGyroswitheveytingC() {
        var AllinoneGyros = new Gyros("Chicken",true,true,true,true);
        assertEquals(8,AllinoneGyros.calculatePrice());
    }
    @Test
    void getThePriceofGyroswitheveytingB() {
        var AllinoneGyros = new Gyros("Beef",true,true,true,true);
        assertEquals(9.5,AllinoneGyros.calculatePrice());
    }
    @Test
    void getThePriceofGyroswitheveytingL() {
        var AllinoneGyros = new Gyros("Lamb",true,true,true,true);
        assertEquals(9,AllinoneGyros.calculatePrice());
    }
}