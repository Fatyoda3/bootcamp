package com.tw.bootcamp.p3;

import java.util.Objects;

public class Lengths {
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
        String unitToConvert = otherMeasure.unit;
        if (Objects.equals(unitToConvert, this.unit)) {
            return otherMeasure.measurement;
        }

        if (Objects.equals(unitToConvert, "ft")) {
            return this.measurement / 12;
        }
        if (Objects.equals(unitToConvert, "in")) {
            return this.measurement * 12;
        }
        return otherMeasure.measurement;
    }
}
