package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldReturnInstanceOfParkingLot() {
        assertInstanceOf(ParkingLot.class, new ParkingLot(1));
    }

    @Test
    void parkACar() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park("car"));
    }

    @Test
    void parkTwoCars() {
        ParkingLot parkingLot = new ParkingLot(5);
        boolean isCarParked = parkingLot.park("car");
        boolean isSecondCarParked = parkingLot.park("car");

        assertTrue(isCarParked);
        assertTrue(isSecondCarParked);
    }

    @Test
    void shouldReturnParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(2);
        parkingLot.park("car");
        parkingLot.park("car");

        assertTrue(parkingLot.isFull());

    }

    @Test
    void shouldNotParkCarAsLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(2);
        parkingLot.park("car");
        parkingLot.park("car");
        boolean isParked = parkingLot.park("car");
        assertFalse(isParked);

    }
}
