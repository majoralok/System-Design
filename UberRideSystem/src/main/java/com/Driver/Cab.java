package com.Driver;

import com.common.BaseModel;

public class Cab extends BaseModel {
    DriverUser driverUser;
    boolean isFree;
    int noOfSeats;
    String src;
    String dest;

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


    public DriverUser getDriverUser() {
        return driverUser;
    }

    public void setDriverUser(DriverUser driverUser) {
        this.driverUser = driverUser;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

}
