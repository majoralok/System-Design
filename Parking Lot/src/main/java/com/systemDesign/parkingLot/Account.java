package com.systemDesign.parkingLot;

// For simplicity, we are not defining getter and setter functions. The reader can
// assume that all class attributes are private and accessed through their respective
// public getter methods and modified only through their public methods function.

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();
}