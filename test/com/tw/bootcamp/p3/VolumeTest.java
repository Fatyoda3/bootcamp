package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest {
    @Test
    void shouldCompareGallonToLiters() {
        Volume liters = Volume.createLiters(3.78);
        Volume gallon = Volume.createGallons(1);
        assertEquals(liters, gallon);
    }

    @Test
    void shouldCompareHalfGallonToLiters() {
        Volume halfLiters = Volume.createLiters(3.78 /2 );
        Volume halfGallon = Volume.createGallons(0.5);
        assertEquals(halfGallon, halfLiters);
    }


}
