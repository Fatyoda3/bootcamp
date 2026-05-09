package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AssistantTest {
    @Test
    void shouldReturnInstance() {
        assertInstanceOf(Assistant.class,new Assistant(new ArrayList<>()));
    }

    @Test
    void shouldReturnAvailableParkingSlot() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = ParkingLot.create(2);
        parkingLots.add(parkingLot);
        Assistant assistant = new Assistant(parkingLots);
        assertEquals(parkingLot, assistant.findAvailableParkingLot());
    }

    @Test
    void shouldReturnNullNoParkingLotsAreAvailable() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = ParkingLot.create(1);
        parkingLot.park("car");
        parkingLots.add(parkingLot);
        Assistant assistant = new Assistant(parkingLots);
        assertNull(assistant.findAvailableParkingLot());
    }

    @Test
    void shouldGenerateReport() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = ParkingLot.create(1);
        parkingLot.park("car");
        parkingLots.add(parkingLot);
        Assistant assistant = new Assistant(parkingLots);
        String expectedReport = "parking lot 1 is full => true | parked count -> 1\n";
        assertEquals(expectedReport, assistant.lotStatus());

    }
}
