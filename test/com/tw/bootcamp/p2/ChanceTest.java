package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {

    @Test
    void probabilityOfGettingTail() {
        Chance chance = Chance.create(0.5);
        assertEquals(Chance.create(0.5), chance.getProbability());
    }

    @Test
    void probabilityOfNotGettingTailTest() {
        Chance chance = Chance.create(0.5);
        assertEquals(Chance.create(0.5), chance.getEventNotOccurring());
    }

    @Test
    void checkingTheProbabilityOfAtLeastOneTail() {
        Chance chanceOfGettingATail = Chance.create(0.5);
        Chance chanceOfGettingAnotherTail = Chance.create(0.5);
        assertEquals(Chance.create(0.75), chanceOfGettingATail.or(chanceOfGettingAnotherTail));
    }

    @Test
    void checkingTheProbabilityOfTails() {
        Chance changeOfGettingTail = Chance.create(0.5);
        Chance chanceOfGettingAnotherTail = Chance.create(0.5);
        assertEquals(Chance.create(0.25), changeOfGettingTail.and(chanceOfGettingAnotherTail));
    }

    @Test
    void impossibleProbabilityTest() {
        assertThrows(Error.class , ()-> Chance.create(10));
        assertThrows(Error.class , ()-> Chance.create(-1));
    }

}
