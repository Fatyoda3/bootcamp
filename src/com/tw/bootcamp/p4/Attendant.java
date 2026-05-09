package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class Attendant {
    private final int lotCount;
    private final ArrayList<ParkingLot> parkingLots;
    private final Assistant assistant;
    private Integer nextId = 0;

    private Attendant(int lotCount, ArrayList<ParkingLot> parkingLots, Assistant assistant) {
        this.lotCount = lotCount;
        this.parkingLots = parkingLots;
        this.assistant = assistant;
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

        Assistant assistant = new Assistant(parkingLots);
        return new Attendant(lotCount, parkingLots, assistant);
    }

    public Ack park(String car) {
        nextId += 1;
        String parkingId = car.concat(nextId.toString());

        ParkingLot parkingLot = assistant.findAvailableParkingLot();

        if (parkingLot == null) {
            return new Ack(parkingId, false);
        }

        parkingLot.park(car);
        return new Ack(parkingId, true);
    }

    public void parkingLotStatus() {
        String report = assistant.lotStatus();
        System.out.println(report);
    }

    public ArrayList<ParkingLot> getAllAvailableParkingLots(int threshold) {
        return assistant.getAllAvailableParkingLots(threshold);
    }
}
