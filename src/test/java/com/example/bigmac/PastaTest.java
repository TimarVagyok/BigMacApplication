package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PastaTest {

    @Test
    void getThePriceofPastawitheveytingB(){
        var AllinOnePasta = new Pasta("All in One Pasta (Beef)","Beef",
                PastaType.Mezze_maniche_wholemeal,true,true,
                true,true,true);
        assertEquals(11.1,AllinOnePasta.calculatePastaPrice());
    }
    @Test
    void getThePriceofPastwitheveytingC(){
        var AllinOnePasta = new Pasta("All in One Pasta (Chicken)","Chicken",
                PastaType.Mezze_maniche_wholemeal,true,true,
                true,true,true);
        assertEquals(9.6,AllinOnePasta.calculatePastaPrice());
    }
    @Test
    void getThePriceofPastwitheveytingL(){
        var AllinOnePasta = new Pasta("All in One Pasta (Lamb)","Lamb",
                PastaType.Mezze_maniche_wholemeal,true,true,
                true,true,true);
        assertEquals(10.6,AllinOnePasta.calculatePastaPrice());
    }
    @Test
    void testPastaPriceWithCheese() {
        var pasta = new Pasta("Pasta with Cheese", "Chicken",
                PastaType.Fusilli, true, true,
                false, false, false);
        assertEquals(8.5, pasta.calculatePastaPrice());
    }

    @Test
    void testPastaPriceWithSeafoodAndBacon() {
        var pasta = new Pasta("Pasta with Seafood and Bacon", "Beef",
                PastaType.penne, true, true, true, false, true);
        assertEquals(10.8, pasta.calculatePastaPrice());
    }

    @Test
    void testPastaPriceWithTomatoesAndSalami() {
        var pasta = new Pasta("Pasta with Tomatoes and Salami", "Lamb",
                PastaType.Spaghetti, true, true, false, true, false);
        assertEquals(9.8, pasta.calculatePastaPrice());
    }

}