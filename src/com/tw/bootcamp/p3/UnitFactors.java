package com.tw.bootcamp.p3;

public enum UnitFactors {
    CM(1 / 2.5),
    FT(12.0),
    IN(1.0),
    MM(1 / 25.0),

    LITER(1.0),
    GALLON(3.78);

    private final double ratio;

    UnitFactors(double ratio) {
        this.ratio = ratio;
    }

    public double normalize(double measurement) {
        return measurement * this.ratio;
    }
}
