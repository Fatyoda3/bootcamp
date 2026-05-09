package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class Attendant {
    private final int lotCount;
    private final ArrayList<ParkingLot> parkingLots;

    private Attendant(int lotCount, ArrayList<ParkingLot> parkingLots) {
        this.lotCount = lotCount;
        this.parkingLots = parkingLots;
    }

    public static Attendant createParkingAttendant(int lotCount, int slots) {
        if (lotCount < 1) {
            throw new Error("invalid capacity for lot count.");
        }

        ArrayList<ParkingLot> parkingLots = new ArrayList<>(lotCount);

        for (int i = 0; i < lotCount; i++) {
            ParkingLot parkingLot = ParkingLot.create(slots);
            parkingLots.add(parkingLot);
        }

        return new Attendant(lotCount, parkingLots);
    }

    public boolean park(String car) {
        for (ParkingLot parkingLot : this.parkingLots) {
            if (!parkingLot.isFull()) {
                return parkingLot.park(car);
            }
        }

        return false;
    }
}
