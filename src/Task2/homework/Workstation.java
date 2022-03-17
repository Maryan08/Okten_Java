package Task2.homework;

import java.util.Objects;

public class Workstation extends Laptop {
    private boolean cd_rom;

    public Workstation(String hardware, String cpu, String accumulate, boolean touchpad) {
        super(hardware, cpu, accumulate, touchpad);
    }

    public Workstation(String hardware, String cpu, String accumulate, boolean touchpad, boolean cd_rom) {
        super(hardware, cpu, accumulate, touchpad);
        this.cd_rom = cd_rom;
    }

    public boolean isCd_rom() {
        return cd_rom;
    }

    public void setCd_rom(boolean cd_rom) {
        this.cd_rom = cd_rom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Workstation that = (Workstation) o;
        return cd_rom == that.cd_rom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cd_rom);

    }

    @Override
    public String toString() {
        return "Workstation{" +
                "cd_rom=" + cd_rom +
                '}';
    }
}
