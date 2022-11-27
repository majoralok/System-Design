package models;

public class DisplayBoard {
    String id;
    ParkingSpot handicappedSpot;
    ParkingSpot smallSpot;
    ParkingSpot MediumSpot;
    ParkingSpot LargeSpot;
    ParkingSpot ExtraLargeSpot;

    public void displaySpots(){
        if(handicappedSpot.isFree())
            System.out.println(handicappedSpot.getCount());
        //similarly for others
    }
}
