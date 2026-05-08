package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {

    public static final double CM_INCH_RATIO = 2.5;
    private final double measurement;
    private final UnitFactors unit;

    protected Length(double measurement, UnitFactors unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    protected static Length create(double measurement, UnitFactors unit) {
        if (measurement < 0.0) {
            throw new Error("Invalid Measurement. ");
        }
        double normalizedValue = normalizeUnit(measurement, unit);

        return new Length(normalizedValue, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length measure = (Length) o;

        return Double.compare(this.measurement, measure.measurement) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    public boolean compareTo(Length measure) {
        return Double.compare(this.measurement, measure.measurement) == 0;
    }

    protected static double normalizeUnit(double measurement, UnitFactors unit) {
        return unit.normalize(measurement);
    }

    public Length add(Length length) {
        double addedLength = this.measurement + length.measurement;
        return createInches(addedLength);
    }

    public static Length createInches(double measurement) {
        return Length.create(measurement, UnitFactors.IN);
    }

    public static Length createCm(double measurement) {
        return Length.create(measurement, UnitFactors.CM);
    }

    public static Length createFt(double measurement) {
        return Length.create(measurement, UnitFactors.FT);
    }

    public static Length createMMs(double measurement) {
        return Length.create(measurement, UnitFactors.MM);
    }

}