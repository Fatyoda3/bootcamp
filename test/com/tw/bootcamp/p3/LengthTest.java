package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void shouldCreateAnInstanceOf1Feet() {
        assertInstanceOf(Length.class, Length.createFt(1));
    }

    @Test
    void shouldCreateAnInstanceOf1Inch() {
        assertInstanceOf(Length.class, Length.createInches(1));
    }

    @Test
    void shouldCreateAnInstanceOf1cm() {
        assertInstanceOf(Length.class, Length.createCm(1));
    }

    @Test
    void shouldCompareHalfFeetToSixInches() {
        Length halfFeet = Length.createFt(0.5);
        Length sixInches = Length.createInches(6);
        assertEquals(halfFeet, sixInches);
    }

    @Test
    void shouldCompareSameLengthsOfInches() {
        Length inch = Length.createInches(1);
        Length anotherInch = Length.createInches(1);
        assertEquals(anotherInch, inch);
    }

    @Test
    void shouldCompareSameLengthsOfFeet() {
        Length feet = Length.createFt(1);
        Length anotherFeet = Length.createFt(1);
        assertEquals(feet, anotherFeet);
    }

    @Test
    void shouldReturnNotEqual() {
        Length feet = Length.createFt(1);
        Length sixInches = Length.createInches(6);
        assertNotEquals(feet, sixInches);
    }

    @Test
    void shouldCompareTwoInchTo5Cm() {
        Length twoInches = Length.createInches(2);
        Length fiveCm = Length.createCm(5);
        assertEquals(twoInches, fiveCm);
    }

    @Test

    void shouldCompareMMToCm() {
        assertEquals(Length.createMMs(10), Length.createCm(1));
    }

    @Test
    void shouldCompare1MMTo1Cm() {
        assertNotEquals(Length.createMMs(1), Length.createCm(1));
    }

    @Test
    void shouldThrowErrorInvalidLength() {
        assertThrows(Error.class, () -> Length.createFt(-1));
    }

    @Test
    void shouldCompareTwoLengthsAndReturnTrue() {
        Length feet = Length.createFt(1);
        Length feetInCm = Length.createCm(30);
        assertTrue(feet.compareTo(feetInCm));
    }

    @Test
    void shouldReturnTheNewAddedLength(){
        Length twoInches = Length.createInches(2);
        Length threeInches = Length.createInches(3);
        assertEquals(Length.createInches(5), twoInches.add(threeInches));
    }

    @Test
    void shouldReturnTheAddedLengthInInches() {
        Length twoInches = Length.createInches(2);
        Length oneIncheInCm = Length.createCm(2.5);
        assertEquals(Length.createInches(3), twoInches.add(oneIncheInCm));
    }
}
