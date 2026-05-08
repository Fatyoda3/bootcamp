package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private final double measurement;
    private final UnitFactors unit;

    private Volume(double measurement, UnitFactors unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    private static Volume create(double measurement, UnitFactors unit) {
        if (measurement < 0.0) {
            throw new Error("Invalid Volume. ");
        }

        return new Volume(measurement, unit);
    }

    public static Volume createLiters(double measurement) {
        return create(measurement, UnitFactors.LITER);
    }

    public static Volume createGallons(double measurement) {
        return create(measurement, UnitFactors.GALLON);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume unit = (Volume) o;
        return Double.compare(normalizeUnitIntoVolume(this), normalizeUnitIntoVolume(unit)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    public boolean compareTo(Volume length) {
        return Double.compare(normalizeUnitIntoVolume(this), normalizeUnitIntoVolume(length)) == 0;
    }

    private double normalizeUnitIntoVolume(Volume volume) {
        return volume.measurement * volume.unit.ratio;
    }
}
