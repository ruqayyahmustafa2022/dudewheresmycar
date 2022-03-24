package com.detroitlabs.dudewheresmycar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)   //tells jackson to map from response object to class any props that
// we don't have values, ignore

public class Location {
    private double latitude;
    private double longitude;


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    //TODO: Fix this method
    public String fetchMapData(double longitude, double latitude){
        String coordinate1 = String.valueOf(longitude);
        String coordinate2 = String.valueOf(latitude);


        return coordinate1 + "," + coordinate2;
    }

}//end Location class
