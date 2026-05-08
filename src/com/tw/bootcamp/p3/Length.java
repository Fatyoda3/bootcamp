package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {

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

        return new Length(measurement, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length unit = (Length) o;
        return Double.compare(normalizeUnit(this), normalizeUnit(unit)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    public boolean compareTo(Length unit) {
        return Double.compare(normalizeUnit(this), normalizeUnit(unit)) == 0;
    }

    protected double normalizeUnit(Length measure) {
        return measure.unit.normalize(measure.measurement);
    }

    public Length add(Length length) {
        if (this.unit != length.unit) {
            throw new Error("Incompatible type");
        }

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