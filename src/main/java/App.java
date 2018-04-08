package main.java;

public class App {
    public static void main(String[] args) {
        MusicalInstruments[] array = new MusicalInstruments[9];
        array[0] = new Violin();
        array[1] = new Alto();
        array[2] = new Cello();
        array[3] = new Guitar();
        array[4] = new Harp();
        array[5] = new Balalaika();
        array[6] = new Hihat();
        array[7] = new Snare();
        array[8] = new Tambourine();
        for (MusicalInstruments instrument : array) {
            instrument.play();

            if (instrument instanceof StringedInstruments) {
                System.out.println(instrument.getClass().getSimpleName() + " string number =  " + ((StringedInstruments) instrument).getStringNumber());
            }
            if (instrument instanceof Drums){
                System.out.println(instrument.getClass().getSimpleName() + " diameter =  " + ((Drums) instrument).getDiameter() + " inches");
            }
        }
    }
}
