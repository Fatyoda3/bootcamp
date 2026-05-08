package com.tw.bootcamp.p3;

public enum Units {
    CM(1),
    FT(30),
    IN(2.5),
    MM(0.1);

    public final double proportion ;

    Units(double cmProportion) {
        this.proportion = cmProportion;
    }

}
