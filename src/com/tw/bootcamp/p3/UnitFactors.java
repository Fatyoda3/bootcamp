package com.tw.bootcamp.p3;

public enum UnitFactors {
    CM(1),
    FT(30),
    IN(2.5),
    MM(0.1),
    LITER(1),
    GALLON(3.78);

    public final double ratio;

    UnitFactors(double ratio) {
        this.ratio = ratio;
    }

}
