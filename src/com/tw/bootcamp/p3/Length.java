package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final double measurement;
    private final UnitFactors unit;

    private Length(double measurement, UnitFactors unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    private static Length create(double measurement, UnitFactors unit) {
        if (measurement < 0.0) {
            throw new Error("Invalid length. ");
        }

        return new Length(measurement, unit);
    }

    public static Length createInches(double measurement) {
        return create(measurement, UnitFactors.IN);
    }

    public static Length createCm(double measurement) {
        return create(measurement, UnitFactors.CM);
    }

    public static Length createFt(double measurement) {
        return create(measurement, UnitFactors.FT);
    }

    public static Length createMMs(double measurement) {
        return create(measurement, UnitFactors.MM);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(normalizeUnitIntoCm(this), normalizeUnitIntoCm(length)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    public boolean compareTo(Length length) {
        return Double.compare(normalizeUnitIntoCm(this), normalizeUnitIntoCm(length)) == 0;
    }

    private double normalizeUnitIntoCm(Length length) {
        return length.measurement * length.unit.ratio;
    }
}
