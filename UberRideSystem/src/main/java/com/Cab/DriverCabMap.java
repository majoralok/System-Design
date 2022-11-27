package com.Cab;

import com.Driver.Cab;
import com.Driver.DriverUser;

import java.util.HashMap;
import java.util.Map;

public class DriverCabMap {
    static Map<DriverUser, Cab> driverUserCabMap = new HashMap<>();
    public static Cab getCab(DriverUser driverUser){
        return driverUserCabMap.get(driverUser);
    }
}
