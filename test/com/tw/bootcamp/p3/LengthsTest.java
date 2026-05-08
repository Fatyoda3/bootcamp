package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthsTest {

    @Test
    void shouldCreateAnInstanceOf1Feet() {
        assertInstanceOf(Lengths.class, new Lengths(1, "ft"));
    }

    @Test
    void shouldCompareHalfFeetToSixInches() {
        Lengths halfFeet = new Lengths(0.5, "ft");
        Lengths sixInches = new Lengths(6, "in");
        assertEquals(halfFeet, sixInches);
    }

}
