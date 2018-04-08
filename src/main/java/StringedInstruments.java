package main.java;

public abstract class StringedInstruments extends MusicalInstruments {
    public int getStringNumber() {
        return this.stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public int stringNumber;
    public void play() {
        System.out.println("Pilly-tilly");
    }
}
