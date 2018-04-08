package main.java;

abstract public class Drums extends MusicalInstruments{
    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int diameter;
}
