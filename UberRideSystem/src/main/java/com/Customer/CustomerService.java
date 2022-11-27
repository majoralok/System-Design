package com.Customer;

import com.Cab.Trip;
import com.common.CabSelectionService;
import com.common.TripStatus;
import com.common.VehicleType;

import java.util.Collections;
import java.util.List;

public class CustomerService {
    //private static LOGGER;
    public List<Trip> selectRide(String src, String dest, int seats, VehicleType vehicleType) {
        Trip trip = CabSelectionService.selectionStrategy(src, dest, vehicleType, seats);
        if(trip == null){
            System.out.println("No Direct Cab avaialbe");
        return CabSelectionService.selectMultipleCabs(src, dest, seats, vehicleType);
        }
        return Collections.singletonList(trip);

    }

    public void endRide(Trip trip){
        trip.setTripStatus(TripStatus.COMPLETE);
        CabSelectionService.calculateFare(trip);
    }
}
