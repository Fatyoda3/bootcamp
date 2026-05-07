package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {

    @Test
    void shouldReturnHalf() {
        Chance chance = new Chance(0.5);
        assertEquals(new Chance(0.5), chance.getChance());
    }

    @Test
    void shouldReturnChanceOfNotGettingTail() {
        Chance chance = new Chance(0.5);
        assertEquals(new Chance(0.5), chance.getEventNotOccurring());
    }

    @Test
    void checkingTheProbabilityOfAtLeastOneTail() {
        Chance coinOne = new Chance(0.5);
        Chance coinTwo = new Chance(0.5);
        assertEquals(new Chance(0.75), coinOne.Or(coinTwo));
    }

    @Test
    void probabilityOfDiceRollLandingA3() {
        assertEquals(new Chance(0.25),Chance.probability(4,1));
    }

}
