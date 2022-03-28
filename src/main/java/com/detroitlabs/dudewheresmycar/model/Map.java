package com.detroitlabs.dudewheresmycar.model;

//import java.awt.*;

import java.util.List;

public class Map {

    List<Coordinates> coordinates;
    private String mapSource;

    public String getMapSource() {
        return mapSource;
    }

    public void setMapSource(String mapSource) {
        this.mapSource = mapSource;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinates> coordinates) {
        this.coordinates = coordinates;
    }
}
