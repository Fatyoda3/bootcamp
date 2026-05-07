package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void shouldReturnCalculatedArea() {
        Square square = new Square( 20);
        assertEquals(400.0, square.calculateArea());
    }

    @Test
    void shouldReturnCalculatedPerimeter() {
        Square square = new Square(20);
        assertEquals(80.0, square.calculatePerimeter());
    }

    @Test
    void ShouldHandleFloatErrorForPerimeterCalculation() {
        Square square = new Square((double) 1 / 3);
        assertEquals(1.33, square.calculatePerimeter(), 0.1);
    }

    @Test
    public void ShouldHandleFloatErrForAreaCalculation() {
        Square square = new Square((double) 1 / 3);
        assertEquals(0.11, square.calculateArea(), 0.01);
    }
}
