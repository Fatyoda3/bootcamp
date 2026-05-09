package com.tw.bootcamp.p4;

public record Ack(String id, boolean isParked) {
    @Override
    public String toString() {
        return "Ack{" +
                "id='" + id + '\'' +
                ", isParked=" + isParked +
                '}';
    }
}
