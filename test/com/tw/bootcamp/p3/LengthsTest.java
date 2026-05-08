package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthsTest {

    @Test
    void shouldCreateAnInstanceOf1Feet() {
        assertInstanceOf(Lengths.class, Lengths.createFt(1));
    }

    @Test
    void shouldCreateAnInstanceOf1Inch() {
        assertInstanceOf(Lengths.class, Lengths.createInches(1));
    }

    @Test
    void shouldCreateAnInstanceOf1cm() {
        assertInstanceOf(Lengths.class, Lengths.createCm(1));
    }

    @Test
    void shouldCompareHalfFeetToSixInches() {
        Lengths halfFeet = Lengths.createFt(0.5);
        Lengths sixInches = Lengths.createInches(6);
        assertEquals(halfFeet, sixInches);
    }
    @Test
    void shouldCompareSameLengthsOfInches() {
        Lengths inch = Lengths.createInches(1);
        Lengths anotherInch = Lengths.createInches(1);
        assertEquals(anotherInch, inch);
    }
    @Test
    void shouldCompareSameLengthsOfFeets() {
        Lengths feet = Lengths.createFt(1);
        Lengths anotherFeet = Lengths.createFt(1);
        assertEquals(feet, anotherFeet);
    }

    @Test
    void shouldReturnNotEqual() {
        Lengths feet = Lengths.createFt(1);
        Lengths sixInches = Lengths.createInches(6);
        assertNotEquals(feet, sixInches);
    }

    @Test
    void shouldCompareTwoInchTo5Cm() {
        Lengths twoInches = Lengths.createInches(2);
        Lengths fiveCm = Lengths.createCm(5);
        assertEquals(twoInches,fiveCm);
    }

    @Test
    void shouldThrowErrorInvalidLength() {
        assertThrows(Error.class, ()-> Lengths.createFt(-1));
    }
}
