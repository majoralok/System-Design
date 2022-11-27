package com.systemDesign.parkingLot;

public abstract class ParkingSpot {
    private String number;
    private boolean free;
    private Vehicle vehicle;
    private final ParkingSpotType type;

    public Boolean IsFree() {
        return Boolean.FALSE;
    }

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public Boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
        return Boolean.TRUE;
    }

    public Boolean removeVehicle() {
        this.vehicle = null;
        free = true;
        return Boolean.TRUE;
    }
    public String getNumber(){
        return this.number;
    }
    public ParkingSpotType getSpotType(){
        return this.type;
    }
}

