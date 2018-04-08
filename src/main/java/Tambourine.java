package main.java;

public class Tambourine extends Drums {
    Tambourine () {
        setDiameter(8);
    }
    @Override
    public void play() {
        System.out.println("Tambourine Zz-Zz-Zz");
    }
}
