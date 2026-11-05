package cl.sangut.intro.java.module2.class2;

public class Class2Exercise5 {
    double kilometers;
    long meters;

    public Class2Exercise5(double kilometers, long meters) {
        this.kilometers = kilometers;
        this.meters = meters;
    }

    public long convertKilometersToMeters() {
        return (long) (kilometers * 1000) + meters;
    }

    public double convertMetersToKilometers() {
        return (double) meters / 1000;
    }
}
