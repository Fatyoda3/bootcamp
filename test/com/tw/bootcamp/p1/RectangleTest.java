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
        assertEquals(80.0, new Rectangle(20, 20).calculatePerimeter());
    }

    @Test
    void ShouldHandleFloatErrorForPerimeterCalculation() {
        assertEquals(9.8, new Rectangle((double) 11 / 3, (double) 11 / 9).calculatePerimeter(), 0.1);

    }

    @Test
    public void ShouldHandleFloatErrForAreaCalculation() {
        assertEquals(4.48, new Rectangle((double) 11 / 3, (double) 11 / 9).calculateArea(), 0.01);
    }

}