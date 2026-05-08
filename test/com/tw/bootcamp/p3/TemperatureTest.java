package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void shouldReturnTheInstance() {
        Temperature hundredCelsius = Temperature.createCelsius(100);
        assertInstanceOf(Temperature.class, hundredCelsius);
    }

    @Test
    void shouldReturnTrueTemperaturesAreEqual() {
        Temperature hundredCelsius = Temperature.createCelsius(100);
        Temperature fahrenheit = Temperature.createFahrenheit(212.0);
        assertEquals(hundredCelsius, fahrenheit);
    }

    @Test
    void shouldReturnFalseTemperaturesNotEqual() {
        Temperature threeHundredCelsius = Temperature.createCelsius(300);
        Temperature fahrenheit = Temperature.createFahrenheit(212.0);
        assertNotEquals(threeHundredCelsius, fahrenheit);
    }

    @Test
    void shouldThrowError() {
        assertThrows(Error.class, ()->Temperature.createCelsius(-300));
    }
}