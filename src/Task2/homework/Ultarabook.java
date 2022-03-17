package Task2.homework;

import java.util.Objects;

public class Ultarabook extends Laptop {
    private double weight;

    public Ultarabook() {
    }

public Ultarabook(String hardware, String cpu, String accumulate, boolean touchpad, double weight) {
    super(hardware, cpu, accumulate, touchpad);
    this.weight = weight;
}

public double getWeight() {
    return weight;
}

public void setWeight(double weight) {
    this.weight = weight;
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Ultarabook that = (Ultarabook) o;
    return Double.compare(that.weight, weight) == 0;
}

@Override
public int hashCode() {
    return Objects.hash(super.hashCode(), weight);
}

@Override
public String toString() {
    return "Ultarabook{" +
            "weight=" + weight +
            '}';
}
}
