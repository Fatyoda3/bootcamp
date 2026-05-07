package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {

    @Test
    void shouldReturnHalf() {
        assertEquals(0.5, Chance.probability(2, 1));
    }

    @Test
    void shouldReturnChanceOfGettingTail() {
        Chance coins = Chance.createCoins(1);
        assertEquals(0.5, coins.getProbabilityOfMultipleSample());
    }

    @Test
    void shouldReturnChanceOfNotGettingTail() {
        Chance coins = Chance.createCoins(1);
        assertEquals(0.5, coins.getEventNotOccurring());
    }

    @Test
    void shouldThrowAnError() {
        assertThrows(Error.class, () -> Chance.probability(-1, 0));
    }

    @Test
    void shouldThrowAnErrorWithSwappedParams() {
        assertThrows(Error.class, () -> Chance.probability(1, -1));
    }

    @Test
    void shouldReturnNotOfAnOutcome() {
        Chance coins = Chance.createCoins(1);
        assertEquals(0.5, coins.getEventNotOccurring());
    }

    @Test
    void probabilityTwoCoinsGetTail() {
        Chance coins = Chance.createCoins(2);
        assertEquals(0.75, coins.getProbabilityOfMultipleSample());
    }

    @Test
    void rollADice() {
        Chance dice = Chance.createDice(1);
        assertEquals(0.16, dice.rollDice(),0.01);
    }
}
