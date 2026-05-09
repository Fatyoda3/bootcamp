package com.tw.bootcamp.p5;

import java.util.function.Predicate;

public class Ball {
    private final BallColor ballColor;

    public Ball(BallColor ballColor) {
        this.ballColor = ballColor;
    }

    public boolean isSameColor(BallColor ballColor) {
        return this.ballColor == ballColor;
    }

}
