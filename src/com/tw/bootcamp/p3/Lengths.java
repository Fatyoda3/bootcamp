package com.tw.bootcamp.p3;

import java.util.Objects;

public class Lengths {
    public static final String CM = "cm";
    public static final String FT = "ft";
    public static final String IN = "in";
    private final double measurement;
    private final String unit;

    public Lengths(double measurement, String unit) {
        this.measurement = measurement;
        this.unit = unit;
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
        return switch (length.unit) {
            case FT -> length.measurement * 30;
            case IN -> length.measurement * 2.5;
            default -> length.measurement;
        };
    }
}
