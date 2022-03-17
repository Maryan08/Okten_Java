package Task2.classwork;

public class Drum implements Instrument {
    private double size=20;

    public Drum() {
    }

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Playing drums which size is "+size);

    }
}
