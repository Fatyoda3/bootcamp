package com.tw.bootcamp.problem_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnCalculatedArea() {
        Rectangle rectangle = new Rectangle(20, 20);
        assertEquals(400, rectangle.calculateArea());
    }
}