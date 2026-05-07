package com.tw.bootcamp.p2;

public class Chance {
    public static final int TOTAL_POSSIBLE_OUTCOME = 1;
    private final int totalOutcomes;
    private final int sample;

    public static double probability(int totalOutcomes, int sample) {
        if (totalOutcomes <= 0 || sample < 0) {
            throw new Error("Can't Flip with these values. ");
        }

        return TOTAL_POSSIBLE_OUTCOME / Math.pow(totalOutcomes, sample);
    }

    private Chance(int totalOutcomes, int sample) {
        this.totalOutcomes = totalOutcomes;
        this.sample = sample;
    }

    public static Chance createDice(int dice) {
        return new Chance(6, dice);
    }

    public static Chance createCoins(int coins) {
        return new Chance(2, coins);
    }

    public double getEventNotOccurring() {
        return 1 - probability(this.totalOutcomes, this.sample);
    }

    public double getProbabilityOfMultipleSample() {
        return 1 - probability(this.totalOutcomes, this.sample);
    }

    public double rollDice() {
        return probability(this.totalOutcomes, this.sample);
    }

}
