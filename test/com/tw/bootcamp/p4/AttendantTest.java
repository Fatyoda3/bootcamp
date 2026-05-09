package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AttendantTest {

    @Test
    void shouldCreateParkingLots() {
        Attendant attendant = Attendant.createParkingAttendant(2, 2);
        assertInstanceOf(Attendant.class, attendant);
    }

    @Test
    void shouldParkACar() {
        Attendant attendant = Attendant.createParkingAttendant(2, 2);
        boolean isParked = attendant.park("car");
        assertTrue(isParked);
    }

    @Test
    void shouldNotParkACar() {
        Attendant attendant = Attendant.createParkingAttendant(1, 2);
        attendant.park("car");
        attendant.park("car");
        boolean isParked = attendant.park("car");
        assertFalse(isParked);
    }

    @Test
    void shouldFailToCreateParkingLot() {
        assertThrows(Error.class, () -> Attendant.createParkingAttendant(-1, 2));
    }
}
