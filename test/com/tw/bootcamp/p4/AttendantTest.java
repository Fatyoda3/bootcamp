package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        Ack car = attendant.park("car");

        String id = car.id();
        boolean isParked = car.isParked();

        assertEquals("car1", id);
        assertTrue(isParked);
    }

    @Test
    void shouldNotParkACar() {
        Attendant attendant = Attendant.createParkingAttendant(1, 2);
        attendant.park("car");
        attendant.park("car");
        Ack car = attendant.park("car");

        boolean isParked = car.isParked();
        String id = car.id();

        assertEquals("car3", id);
        assertFalse(isParked);
    }

    @Test
    void shouldParkACarForMulitpleLots() {
        Attendant attendant = Attendant.createParkingAttendant(2, 2);
        attendant.park("car");
        attendant.park("car");
        Ack car = attendant.park("car");

        boolean isParked = car.isParked();
        String id = car.id();
        assertEquals("car3", id);
        assertTrue(isParked);
    }

    @Test
    void shouldFailToCreateParkingLot() {
        assertThrows(Error.class, () -> Attendant.createParkingAttendant(-1, 2));
    }

    @Test
    void shouldReturnTrueAsParkingLotsAreFull() {
        Attendant attendant = Attendant.createParkingAttendant(1, 2);
        attendant.park("car");
        attendant.park("car");

        ArrayList<ParkingLot> available = attendant.getAllAvailableParkingLots(80);

        assertTrue(available.isEmpty());
    }
}
