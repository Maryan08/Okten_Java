package Task2.classwork;

public class Trumpet implements Instrument {
    private double diametr = 10;

    public Trumpet() {
    }

    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Playing trumpet which diametr is "+ diametr);
    }
}
