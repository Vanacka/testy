package cz.gyarab.prg;

public class Kalkulacka {
    public int x;
    public int y;

    Kalkulacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int soucet() {
        return x + y;
    }
    public int rozdil() {
        return x - y;
    }
    public int podil() {
        return x / y;
    }
    public int soucin() {
        return x * y;
    }
}
