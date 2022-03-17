package Task2.homework;

import java.util.Objects;

public class PC {
    private String hardware;
    private String cpu;



    public PC() {
    }

    public PC(String hardware, String cpu) {
        this.hardware = hardware;
        this.cpu = cpu;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return Objects.equals(hardware, pc.hardware) &&
                Objects.equals(cpu, pc.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardware, cpu);
    }
    @Override
    public String toString() {
        return "PC{" +
                "hardware='" + hardware + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
