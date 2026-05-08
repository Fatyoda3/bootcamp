package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthsTest {

    @Test
    void shouldCreateAnInstanceOf1Feet() {
        assertInstanceOf(Lengths.class, new Lengths(1, "ft"));
    }

    @Test
    void shouldCreateAnInstanceOf1Inch() {
        assertInstanceOf(Lengths.class, new Lengths(1, "in"));
    }

    @Test
    void shouldCreateAnInstanceOf1cm() {
        assertInstanceOf(Lengths.class, new Lengths(1, "cm"));
    }

    @Test
    void shouldCompareHalfFeetToSixInches() {
        Lengths halfFeet = new Lengths(0.5, "ft");
        Lengths sixInches = new Lengths(6, "in");
        assertEquals(halfFeet, sixInches);
    }
    @Test
    void shouldCompareSameLengthsOfInches() {
        Lengths inch = new Lengths(1, "in");
        Lengths anotherInch = new Lengths(1, "in");
        assertEquals(anotherInch, inch);
    }
    @Test
    void shouldCompareSameLengthsOfFeets() {
        Lengths feet = new Lengths(1, "ft");
        Lengths anotherFeet = new Lengths(1, "ft");
        assertEquals(feet, anotherFeet);
    }

    @Test
    void shouldReturnNotEqual() {
        Lengths feet = new Lengths(1, "ft");
        Lengths sixInches = new Lengths(6, "in");
        assertNotEquals(feet, sixInches);
    }

    @Test
    void shouldCompareTwoInchTo5Cm() {
        Lengths twoInches = new Lengths(2, "in");
        Lengths fiveCm = new Lengths(5, "cm");
        assertEquals(twoInches,fiveCm);
    }
}
