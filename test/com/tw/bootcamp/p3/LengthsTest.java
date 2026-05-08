package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthsTest {

    @Test
    void shouldCreateAnInstanceOf1Feet() {
        assertInstanceOf(Lengths.class, Lengths.create(1, Units.FT));
    }

    @Test
    void shouldCreateAnInstanceOf1Inch() {
        assertInstanceOf(Lengths.class, Lengths.create(1, Units.IN));
    }

    @Test
    void shouldCreateAnInstanceOf1cm() {
        assertInstanceOf(Lengths.class, Lengths.create(1, Units.CM));
    }

    @Test
    void shouldCompareHalfFeetToSixInches() {
        Lengths halfFeet = Lengths.create(0.5, Units.FT);
        Lengths sixInches = Lengths.create(6, Units.IN);
        assertEquals(halfFeet, sixInches);
    }
    @Test
    void shouldCompareSameLengthsOfInches() {
        Lengths inch = Lengths.create(1, Units.IN);
        Lengths anotherInch = Lengths.create(1, Units.IN);
        assertEquals(anotherInch, inch);
    }
    @Test
    void shouldCompareSameLengthsOfFeets() {
        Lengths feet = Lengths.create(1, Units.FT);
        Lengths anotherFeet = Lengths.create(1, Units.FT);
        assertEquals(feet, anotherFeet);
    }

    @Test
    void shouldReturnNotEqual() {
        Lengths feet = Lengths.create(1, Units.FT);
        Lengths sixInches = Lengths.create(6, Units.IN);
        assertNotEquals(feet, sixInches);
    }

    @Test
    void shouldCompareTwoInchTo5Cm() {
        Lengths twoInches = Lengths.create(2, Units.IN);
        Lengths fiveCm = Lengths.create(5, Units.CM);
        assertEquals(twoInches,fiveCm);
    }

    @Test
    void shouldThrowErrorInvalidLength() {
        assertThrows(Error.class, ()-> Lengths.create(-1,Units.FT));
    }
}
