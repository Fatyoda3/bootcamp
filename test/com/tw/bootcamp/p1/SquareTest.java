package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
