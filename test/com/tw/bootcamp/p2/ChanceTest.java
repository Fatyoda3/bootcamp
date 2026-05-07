package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {

    @Test
    void shouldReturnHalf() {
        Chance chance = new Chance(0.5);
        assertEquals(0.5, chance.getChance());
    }

    @Test
    void shouldReturnChanceOfNotGettingTail() {
        Chance chance = new Chance(0.5);
        assertEquals(0.5, chance.getEventNotOccurring());
    }

    @Test
    void probabilityOfTwoCoinTossAtLeastOneTail() {
        Chance chance = new Chance(0.75);
        assertEquals(0.75, chance.getChance());
    }

    @Test
    void probabilityTwoCoinsGetTail() {
        Chance chance = new Chance(0.75);
        assertEquals(0.75, chance.getChance());
    }

    @Test
    void rollADice() {
        Chance chance = new Chance(0.75);
        assertEquals(0.25, chance.getEventNotOccurring());
    }

    @Test
    void calculateTheProbabilityOfDiceRoll() {
        assertEquals(0.16,Chance.probability(6,1),0.01);
    }
}
