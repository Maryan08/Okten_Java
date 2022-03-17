package Task2.classwork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Guitar guitar1 = new Guitar();
    guitar1.setNumber(8);
    Guitar guitar2 =  new Guitar();
    Drum drum  = new Drum();
    Trumpet trumpet = new Trumpet();
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar1);
        instruments.add(guitar2);
        instruments.add(drum);
        instruments.add(trumpet);
        for (Instrument instrument:instruments
             ) {instrument.play();

        }
    }
}
