package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnCalculatedArea() {
        Rectangle rectangle = new Rectangle(20, 20);
        assertEquals(400.0, rectangle.calculateArea());
    }

    @Test
    void shouldReturnCalculatedPerimeter() {
        Rectangle rectangle = new Rectangle(20, 20);
        assertEquals(80.0, rectangle.calculatePerimeter());
    }

    @Test
    void ShouldHandleFloatErrorForPerimeterCalculation() {
        Rectangle rectangle = new Rectangle((double) 11 / 3, (double) 11 / 9);
        assertEquals(9.8, rectangle.calculatePerimeter(), 0.1);

    }

    @Test
    public void ShouldHandleFloatErrForAreaCalculation() {
        Rectangle rectangle = new Rectangle((double) 11 / 3, (double) 11 / 9);
        assertEquals(4.48, rectangle.calculateArea(), 0.01);
    }

}