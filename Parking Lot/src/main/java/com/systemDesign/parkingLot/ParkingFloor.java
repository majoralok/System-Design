package com.systemDesign.parkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {
    private static final Integer MAX_CAPACITY = 40;
    private String name;
    private int freeHandicappedSpotCount;
    private int freeLargeSpotCount;
    private int freeMotorbikeSpotCount;
    private int freeCompactSpotCount;
    private int freeElectricSpotCount;
    private HashMap<String, HandicappedSpot> handicappedSpots;
    private HashMap<String, CompactSpot> compactSpots;
    private HashMap<String, LargeSpot> largeSpots;
    private HashMap<String, MotorbikeSpot> motorbikeSpots;
    private HashMap<String, ElectricSpot> electricSpots;
    private ParkingDisplayBoard displayBoard;

    public ParkingFloor(String name) {
        this.name = name;
        Map<String, HandicappedSpot> handicappedSpots = new HashMap<>();
        Map<String, CompactSpot> compactSpots = new HashMap<>();
        Map<String, LargeSpot> largeSpots = new HashMap<>();
        Map<String, MotorbikeSpot> motorbikeSpots = new HashMap<>();
        Map<String, ElectricSpot> electricSpots = new HashMap<>();
    }

    public Boolean isFull() {
        int total = freeHandicappedSpotCount + freeLargeSpotCount + freeMotorbikeSpotCount +
                    freeCompactSpotCount + freeElectricSpotCount;
        if(MAX_CAPACITY == total)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }

    public void addParkingSpot(ParkingSpot spot) {
        switch (spot.getSpotType()) {
            case HANDICAPPED:
                handicappedSpots.put(spot.getNumber(), (HandicappedSpot) spot);
                break;
            case COMPACT:
                compactSpots.put(spot.getNumber(), (CompactSpot) spot);
                break;
            case LARGE:
                largeSpots.put(spot.getNumber(), (LargeSpot) spot);
                break;
            case MOTORBIKE:
                motorbikeSpots.put(spot.getNumber(), (MotorbikeSpot) spot);
                break;
            case ELECTRIC:
                electricSpots.put(spot.getNumber(), (ElectricSpot) spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
        switch (spot.getSpotType()) {
            case HANDICAPPED:
                updateDisplayBoardForHandicapped(spot);
                break;
            case COMPACT:
                updateDisplayBoardForCompact(spot);
                break;
            case LARGE:
                //updateDisplayBoardForLarge(spot);
                break;
            case MOTORBIKE:
                //updateDisplayBoardForMotorbike(spot);
                break;
            case ELECTRIC:
                //updateDisplayBoardForElectric(spot);
                break;
            default:
                //print("Wrong parking spot type!");
        }
    }

    private void updateDisplayBoardForHandicapped(ParkingSpot spot) {
        if (this.displayBoard.getHandicappedFreeSpot().getNumber() == spot.getNumber()) {
            // find another free handicapped parking and assign to displayBoard
            for (String key : handicappedSpots.keySet()) {
                if (handicappedSpots.get(key).isFree()) {
                    this.displayBoard.setHandicappedFreeSpot(handicappedSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    private void updateDisplayBoardForCompact(ParkingSpot spot) {
        if (this.displayBoard.getCompactFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : compactSpots.keySet()) {
                if (compactSpots.get(key).isFree()) {
                    this.displayBoard.setCompactFreeSpot(compactSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    public void freeSpot(ParkingSpot spot) {
        spot.removeVehicle();
        switch (spot.getSpotType()) {
            case ParkingSpotType.HANDICAPPED:
                freeHandicappedSpotCount++;
                break;
            case ParkingSpotType.COMPACT:
                freeCompactSpotCount++;
                break;
            case ParkingSpotType.LARGE:
                freeLargeSpotCount++;
                break;
            case ParkingSpotType.MOTORBIKE:
                freeMotorbikeSpotCount++;
                break;
            case ParkingSpotType.ELECTRIC:
                freeElectricSpotCount++;
                break;
            default:
                print("Wrong parking spot type!");
        }
    }
}