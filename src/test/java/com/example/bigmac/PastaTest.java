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
}