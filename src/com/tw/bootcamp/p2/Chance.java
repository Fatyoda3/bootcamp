package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
    private final double chance;

    public Chance(double chance) {
        this.chance = chance;
    }

    public static Chance probability(int totalOutcomes, int sample) {
        if (totalOutcomes <= 0 || sample < 0) {
            throw new Error("Can't Flip with these values. ");
        }

        return new Chance(Math.pow(totalOutcomes, -sample));
    }

    public Chance getChance() {
        return this;
    }

    public Chance getEventNotOccurring() {
        return new Chance(1 - this.chance);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Double.compare(chance, chance1.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public Chance Or(Chance otherChance) {
        double v = this.chance + otherChance.chance - this.chance * otherChance.chance;
        return new Chance(v);
    }
}
