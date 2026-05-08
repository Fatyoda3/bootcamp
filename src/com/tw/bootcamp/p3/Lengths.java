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
        double converted = this.convert(lengths);
        return Double.compare(converted, lengths.measurement) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    private double convert(Lengths otherMeasure) {

        if (Objects.equals(otherMeasure.unit, this.unit)) {
            return otherMeasure.measurement;
        }

        return switch (otherMeasure.unit) {
            case CM -> this.measurement * 2.5;
            case FT -> this.measurement / 12;
            case IN -> this.measurement * 12;
            default -> otherMeasure.measurement;
        };
    }
}
