package com.tw.bootcamp.p2;

public class Chance {
    private final double chance;

    public Chance(double chance) {
        this.chance = chance;
    }

    public static double probability(int totalOutcomes, int sample) {
        if (totalOutcomes <= 0 || sample < 0) {
            throw new Error("Can't Flip with these values. ");
        }

        return Math.pow(totalOutcomes, -sample);
    }

    public double getChance() {
        return this.chance;
    }

    public double getEventNotOccurring() {
        return 1 - this.chance;
    }
}
