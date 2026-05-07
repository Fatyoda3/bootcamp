package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldInstantiateRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(1, 1);
        assertInstanceOf(Rectangle.class, rectangle);
    }

    @Test
    void shouldThrowAnInvalidDimensionError() {
        assertThrows(Error.class, () -> Rectangle.createRectangle(-1, -1));
    }

    @Test
    void shouldReturnCalculatedArea() {
        Rectangle rectangle = Rectangle.createRectangle(20, 20);
        assertEquals(400.0, rectangle.calculateArea());
    }

    @Test
    void shouldReturnCalculatedPerimeter() {
        Rectangle rectangle = Rectangle.createRectangle(20, 20);
        assertEquals(80.0, rectangle.calculatePerimeter());
    }

    @Test
    void ShouldHandleFloatErrorForPerimeterCalculation() {
        Rectangle rectangle = Rectangle.createRectangle(3.67,1.22);

        assertEquals(9.8, rectangle.calculatePerimeter(), 0.1);

    }

    @Test
    public void ShouldHandleFloatErrForAreaCalculation() {
        double floatyWidth = (double) 11 / 3;
        double floatyHeight = (double) 11 / 9;
        Rectangle rectangle = Rectangle.createRectangle(floatyWidth, floatyHeight);
        assertEquals(4.48, rectangle.calculateArea(), 0.01);
    }

}