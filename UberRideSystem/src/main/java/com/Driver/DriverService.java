package com.Driver;

import com.Cab.DriverCabMap;
import com.Cab.Trip;
import com.common.CabSelectionService;

public class DriverService {

    public Trip offerRide(DriverUser driver, String str, String dest) {
        Cab cab = DriverCabMap.getCab(driver);
        CabSelectionService.updateCab(cab);
        return new Trip(cab);
    }
}
