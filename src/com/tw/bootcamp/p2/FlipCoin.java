package com.tw.bootcamp.p2;

public class FlipCoin {
    public static final int TOTAL_POSSIBLE_OUTCOME = 1;

    public static double flip(int possibleOutcomes, int coinCount) {
        if (possibleOutcomes < 0 || coinCount < 0) {
            throw new Error("Can't Flip with these values. ");
        }

        return TOTAL_POSSIBLE_OUTCOME / Math.pow(possibleOutcomes, coinCount);
    }

    public static double getTail() {
        return flip(2 ,1);
    }
}
