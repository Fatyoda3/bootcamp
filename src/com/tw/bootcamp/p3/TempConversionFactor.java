package com.tw.bootcamp.p3;

public enum TempConversionFactor {
    Celsius(1),
    Fahrenheit(5 / 9.0);

    private final double ratio;

    TempConversionFactor(double ratio) {
        this.ratio = ratio;
    }

    public double normalize(double measurement) {
        return (measurement - 32) * ratio;
    }
}
