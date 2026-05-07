package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void shouldInstantiateRectangle() {
        Rectangle square = Rectangle.createSquare(1);
        assertInstanceOf(Rectangle.class, square);
    }

    @Test
    void shouldThrowAnInvalidDimensionError() {
        assertThrows(Error.class, () -> Rectangle.createSquare(-1));
    }

    @Test
    void shouldReturnCalculatedArea() {
        Rectangle square = Rectangle.createSquare(20);
        assertEquals(400.0, square.calculateArea());
    }

    @Test
    void shouldReturnCalculatedPerimeter() {
        Rectangle square = Rectangle.createSquare(20);
        assertEquals(80.0, square.calculatePerimeter());
    }

    @Test
    void ShouldHandleFloatErrorForPerimeterCalculation() {
        Rectangle square = Rectangle.createSquare((double) 1 / 3);
        assertEquals(1.33, square.calculatePerimeter(), 0.1);
    }

    @Test
    public void ShouldHandleFloatErrForAreaCalculation() {
        Rectangle square = Rectangle.createSquare((double) 1 / 3);
        assertEquals(0.11, square.calculateArea(), 0.01);
    }
}
