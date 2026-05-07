package com.tw.bootcamp.person;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PersonTest {

    @Test
    void shouldReturnName() {
        Person mockPerson = Mockito.mock(Person.class);

        when(mockPerson.getName()).thenReturn("name");
        assertEquals("name", mockPerson.getName());
    }
}