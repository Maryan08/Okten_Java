package Task2.homework;

import java.util.Objects;

public class Laptop extends PC {

    private String accumulate;
    private boolean touchpad;

    public Laptop() {
    }

    public Laptop(String hardware, String cpu, String accumulate, boolean touchpad) {
        super(hardware, cpu);
        this.accumulate = accumulate;
        this.touchpad = touchpad;
    }

    public String getAccumulate() {
        return accumulate;
    }

    public void setAccumulate(String accumulate) {
        this.accumulate = accumulate;
    }

    public boolean isTouchpad() {
        return touchpad;
    }

    public void setTouchpad(boolean touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return touchpad == laptop.touchpad &&
                Objects.equals(accumulate, laptop.accumulate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accumulate, touchpad);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "accumulate='" + accumulate + '\'' +
                ", touchpad=" + touchpad +
                '}';
    }
}
