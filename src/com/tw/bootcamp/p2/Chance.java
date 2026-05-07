package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
    private final double probability;

    private Chance(double probability) {
        this.probability = probability;
    }

    public static Chance create(double probability) {
        if (probability > 1 || probability < 0) {
            throw new Error("out of range probability!");
        }

        return new Chance(probability);
    }

    public Chance getProbability() {
        return new Chance(this.probability);
    }

    public Chance getEventNotOccurring() {
        return new Chance(1 - this.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance event = (Chance) o;
        return Double.compare(probability, event.probability) == 0;
    }

    public Chance or(Chance event) {
        double result = this.probability + event.probability - this.probability * event.probability;
        return new Chance(result);
    }

    public Chance and(Chance event) {
        return new Chance(this.probability * event.probability);
    }
}
