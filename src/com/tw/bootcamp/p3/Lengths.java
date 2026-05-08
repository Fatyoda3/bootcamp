package com.tw.bootcamp.p3;

import java.util.Objects;

public class Lengths {
    private final double measurement;
    private final Units unit;

    private Lengths(double measurement, Units unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    public static Lengths create (double measurement, Units unit) {
        if (measurement < 0.0) {
            throw new Error("Invalid length. ");
        }

        return new Lengths(measurement, unit);
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
            case Units.FT -> length.measurement * 30;
            case Units.IN -> length.measurement * 2.5;
            default -> length.measurement;
        };
    }
}
