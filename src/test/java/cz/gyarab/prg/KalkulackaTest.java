package cz.gyarab.prg;

import static org.junit.jupiter.api.Assertions.*;

class KalkulackaTest {

    @org.junit.jupiter.api.Test
    void soucet() {
        Kalkulacka k = new Kalkulacka(1, 2);
        int soucet = k.soucet();
        assertTrue(soucet == (1 + 2));
    }

    @org.junit.jupiter.api.Test
    void rozdil() {
        Kalkulacka k = new Kalkulacka(1, 2);
        int rozdil = k.rozdil();
        assertTrue(rozdil == 1 - 2);
    }

    @org.junit.jupiter.api.Test
    void podil() {
        Kalkulacka k = new Kalkulacka(1, 2);
        int podil = k.podil();
        assertTrue(podil == 1 / 2);
    }

    @org.junit.jupiter.api.Test
    void soucin() {
        Kalkulacka k = new Kalkulacka(1, 2);
        int soucin = k.soucin();
        assertTrue(soucin == 1 * 2);
    }
}