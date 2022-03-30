package com.detroitlabs.dudewheresmycar.model;

//import java.awt.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Map { //going to be used as parent class for Json

    String copyright; //will be used for testing
    List<resourceSet> resourceSets;

    public List<resourceSet> getResourceSets() {
        return resourceSets;
    }

    public void setResourceSets(List<resourceSet> resourceSets) {
        this.resourceSets = resourceSets;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

}




//    List<Coordinates> coordinates;
//    private String mapSource;
//
//    public String getMapSource() {
//        return mapSource;
//    }
//
//    public void setMapSource(String mapSource) {
//        this.mapSource = mapSource;
//    }
//
//    public List<Coordinates> getCoordinates() {
//        return coordinates;
//    }
//
//    public void setCoordinates(List<Coordinates> coordinates) {
//        this.coordinates = coordinates;
//    }
//}
