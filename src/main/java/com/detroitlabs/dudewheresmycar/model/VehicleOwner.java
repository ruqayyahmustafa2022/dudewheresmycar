package com.detroitlabs.dudewheresmycar.model;

import java.util.ArrayList;

public class VehicleOwner{
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public VehicleOwner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}//end VehicleOwner class
