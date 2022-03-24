package com.detroitlabs.dudewheresmycar.model;

import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private String vin;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    public Car(String make, String model, String vin, int carStatus, ArrayList<Double> location) {
        this.make = make;
        this.model = model;
        this.vin = vin;
    }
}//end Car class
