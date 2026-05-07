package com.tw.bootcamp.p2;

public class FlipCoin {
    public static final int TOTAL_POSSIBLE_OUTCOME = 1;

    public static double flip(int totalOutcomes, int coins) {
        if (totalOutcomes <= 0 || coins < 0) {
            throw new Error("Can't Flip with these values. ");
        }

        return  TOTAL_POSSIBLE_OUTCOME / Math.pow(totalOutcomes, coins);
    }

    public static double getEventNotOccurring(int totalOutcomes, int coins){
        return 1 - flip(totalOutcomes,coins);
    }

    public static double getProbabilityOfMultipleCoins(int totalOutcomes, int coins) {
        return 1 - flip(totalOutcomes,coins);
    }

    public static double rollDice(int totalOutcomes, int dice) {
        return  flip(totalOutcomes,dice);
    }


    public static double getTail() {
        return flip(2, 1);
    }

    public static double notGettingTail() {
        return getEventNotOccurring(2,1);
    }
}
