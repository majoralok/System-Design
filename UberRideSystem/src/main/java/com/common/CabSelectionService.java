package com.common;

import com.Cab.Trip;
import com.Driver.Cab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CabSelectionService {

    static List<Cab> cabList;

    public static void updateCab(Cab cab) {
        //fetch the cab info from cab list and update its status
        cab.getId();
    }


    public static List<Cab> getListOfFreeCabs() {
        // return the list of free cabs
        return cabList.stream().filter(Cab::isFree).collect(Collectors.toList());
    }

    public static Trip selectionStrategy(String src, String dest, VehicleType vehicleType, int seats) {
        List<Cab> listOfFreeCabs = getListOfFreeCabs();
        listOfFreeCabs.stream()
                .filter(x -> x.getSrc().equals(src) && x.getDest().equals(dest))
                .collect(Collectors.toList());

        Collections.sort(listOfFreeCabs, Comparator.comparing(Cab::getNoOfSeats));
        return new Trip(listOfFreeCabs.get(0));
    }

    public static Double calculateFare(Trip trip) {
        //based on time and vehicle type we can calculate this price and set this
        //in trip field
        return trip.getPrice();
    }

    public static List<Trip> selectMultipleCabs(String src, String dest, int seats, VehicleType vehicleType) {
        //we breakdown the src and dest and find out cabs most suited and
        List<Cab> listOfFreeCabs = getListOfFreeCabs();
        Collections.sort(listOfFreeCabs, Comparator.comparing(Cab::getNoOfSeats));

        List<Cab> sourceCabs = listOfFreeCabs.stream()
                .filter(x -> x.getSrc().equals(src))
                .collect(Collectors.toList());

        List<Cab> destCabs = listOfFreeCabs.stream()
                .filter(x -> x.getDest().equals(dest))
                .collect(Collectors.toList());

        // Do DFS or BFS to get the list of connected cabs
        return new ArrayList<>();

    }
}
