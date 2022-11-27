package models;

import java.util.List;
import java.util.Map;

public class ParkingFloor extends BaseModel {
    int floor_no;
    String name;
    Integer handicapedSpotCount;
    Integer smallSpotsCount;
    Integer mediumSpotsCount;
    Integer largeSpotsCount;
    Integer largeSpotsCount;
    Map<Integer, ParkingSpot> handicapedSpotList;
    Map<Integer, ParkingSpot> smallSpots;
    Map<Integer, ParkingSpot> mediumSpots;
    Map<Integer, ParkingSpot> largeSpots;
    Map<Integer, ParkingSpot> extraLargeSpots;





}
