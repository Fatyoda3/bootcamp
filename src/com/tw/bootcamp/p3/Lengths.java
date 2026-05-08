package com.tw.bootcamp.p3;

import java.util.Objects;

public class Lengths {
    private final double measurement;
    private final Units unit;

    private Lengths(double measurement, Units unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    private static Lengths create(double measurement, Units unit) {
        if (measurement < 0.0) {
            throw new Error("Invalid length. ");
        }

        return new Lengths(measurement, unit);
    }

    public static Lengths createInches(double measurement) {
        return create(measurement, Units.IN);
    }

    public static Lengths createCm(double measurement) {
        return create(measurement, Units.CM);
    }

    public static Lengths createFt(double measurement) {
        return create(measurement, Units.FT);
    }

    public static Lengths createMMs(double measurement) {
        return create(measurement, Units.MM);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lengths lengths = (Lengths) o;
        return Double.compare(normalizeUnitIntoCm(this), normalizeUnitIntoCm(lengths)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    private double normalizeUnitIntoCm(Lengths length) {
        return length.measurement * length.unit.proportion;
    }
}
