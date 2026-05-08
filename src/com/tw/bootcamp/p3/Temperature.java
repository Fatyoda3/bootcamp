package com.tw.bootcamp.p3;

import java.util.Objects;

public class Temperature {
    private final double measurement;
    private final TempConversionFactor unit;

    protected Temperature(double measurement, TempConversionFactor unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    protected static Temperature create(double measurement, TempConversionFactor unit) {
        double normalizedValue = normalizeUnit(measurement, unit);

        if (normalizedValue < -273.0) {
            throw new Error("Can't go below sub-zero");
        }

        return new Temperature(normalizedValue, unit);
    }

    public static Temperature createCelsius(double celsius) {
        return create(celsius, TempConversionFactor.Celsius);
    }

    public static Temperature createFahrenheit(double fahrenheit) {
        return create(fahrenheit, TempConversionFactor.Fahrenheit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature measure = (Temperature) o;

        return Double.compare(this.measurement, measure.measurement) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(measurement, unit);
    }

    protected static double normalizeUnit(double measurement, TempConversionFactor unit) {
        if (unit == TempConversionFactor.Celsius) {
            return measurement;
        }
        return unit.normalize(measurement);
    }

}
