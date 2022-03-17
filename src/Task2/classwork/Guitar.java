package Task2.classwork;

public class Guitar implements Instrument {
    private int number = 5;

    public Guitar() {
    }

    public Guitar(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void play() {
        System.out.println("Playing guitar with " + number + " struns");

    }
}
