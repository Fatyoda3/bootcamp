package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class Assistant {
    private final ArrayList<ParkingLot> parkingLots;

    public Assistant(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLot findAvailableParkingLot() {
        for (ParkingLot parkingLot : this.parkingLots) {

            if (!parkingLot.isFull()) {
                return parkingLot;
            }
        }
        return null;
    }

    public String lotStatus() {
        StringBuilder statusReports = new StringBuilder();
        int i = 1;

        for (ParkingLot parkingLot : parkingLots) {
            String report = "parking lot %d is full => %b | parked count -> %d\n"
                    .formatted(i, parkingLot.isFull(), parkingLot.parkedCount());
            statusReports.append(report);
        }

        return statusReports.toString();
    }


    public ArrayList<ParkingLot> getAllAvailableParkingLots(int threshold) {
        ArrayList<ParkingLot> availableParkingLots = new ArrayList<>();

        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.isBelowThreshold(threshold)) {
                availableParkingLots.add(parkingLot);
            }
        }

        return availableParkingLots;
    }
}
