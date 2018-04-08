package main.java;

public class Snare extends Drums {
    Snare () {
        setDiameter(13);
    }
    @Override
    public void play() {
        System.out.println("Snare Bdysh-Bdysh");
    }
}
