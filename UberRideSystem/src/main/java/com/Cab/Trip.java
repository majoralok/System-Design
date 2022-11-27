package com.Cab;

import com.Driver.Cab;
import com.Driver.DriverUser;
import com.common.TripStatus;

import java.sql.Time;
import java.util.Date;

public class Trip {
    String src;
    String dest;
    Date time;
    Date endTime;
    DriverUser driverUser;
    Double price;
    Time eta;
    TripStatus tripStatus;
    Cab cab;

    // we can create builder patther
    public Trip(Cab cab){
        this.cab = cab;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public DriverUser getDriverUser() {
        return driverUser;
    }

    public void setDriverUser(DriverUser driverUser) {
        this.driverUser = driverUser;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Time getEta() {
        return eta;
    }

    public void setEta(Time eta) {
        this.eta = eta;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }
}
