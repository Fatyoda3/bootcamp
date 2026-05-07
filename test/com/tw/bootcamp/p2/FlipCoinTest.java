package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlipCoinTest {

    @Test
    void shouldReturnHalf() {
        assertEquals(0.5, FlipCoin.flip(2, 1));
    }

    @Test
    void shouldReturnChanceOfGettingTail() {
        assertEquals(0.5, FlipCoin.getTail());
    }

    @Test
    void shouldReturnChanceOfNotGettingTail() {
        assertEquals(0.5, FlipCoin.notGettingTail());
    }

    @Test
    void shouldThrowAnError() {
        assertThrows(Error.class, () -> FlipCoin.flip(-1, 0));
    }

    @Test
    void shouldThrowAnErrorWithSwappedParams() {
        assertThrows(Error.class, () -> FlipCoin.flip(1, -1));
    }

    @Test
    void shouldReturnNotGettingChanges() {
        assertEquals(0.5,FlipCoin.getEventNotOccurring(2,1));
    }

    @Test
    void flipTwoCoinsGetTail() {
        assertEquals(0.75, FlipCoin.getProbabilityOfMultipleCoins(2,2));
    }

    @Test
    void rollAdice() {
        assertEquals(0.16, FlipCoin.flip(6,1),0.01);
    }
}
