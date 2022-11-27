package com.Driver;

import com.common.Address;
import com.common.BaseModel;
import com.common.Rating;

public class DriverUser extends BaseModel {
    private Address address;
    private Rating rating;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
