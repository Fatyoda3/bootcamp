package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume  {
    private final double measurement;
    private final UnitFactors unit;

    protected Volume(double measurement, UnitFactors unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    protected static Volume create(double measurement, UnitFactors unit) {
        if (measurement < 0.0) {
            throw new Error("Invalid Measurement. ");
        }

        double normalizedValue = normalizeVolume(measurement, unit);
        return new Volume(normalizedValue, unit);
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
        return Double.compare(this.measurement, this.measurement) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

//    public boolean compareTo(Volume unit) {
//        return Double.compare(normalizeVolume(this), normalizeVolume(unit)) == 0;
//    }

    protected static  double normalizeVolume(double measurement, UnitFactors unit) {
        return  unit.normalize(measurement);
    }

//    protected double normalizeVolume(Volume measure) {
//        return  measure.unit.normalize(measure.measurement);
//    }

    public Volume add(Volume measure) {
        double addedVolume = this.measurement + measure.measurement;
        return createLiters(addedVolume);
    }
}
