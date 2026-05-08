package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<Object> slots;
    private final int totalCapacity;

    private ParkingLot(int capacity) {
        this.totalCapacity = capacity;
        this.slots = new ArrayList<>(this.totalCapacity);
    }

    public static  ParkingLot create(int capacity){
        if (capacity < 1) {
            throw new Error("invalid capacity");
        }
        return new ParkingLot(capacity);
    }


    public boolean park(String car) {
        if(this.isFull()) {
            return false;
        }

        return slots.add(car);
    }

    public boolean isFull() {
        return this.slots.size() == this.totalCapacity ;
    }
}
