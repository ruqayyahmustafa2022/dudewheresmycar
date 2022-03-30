package com.detroitlabs.dudewheresmycar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class resourceSet {
    List<resource> resources;
    int estimatedTotal; //will be used for unit testing

    public int getEstimatedTotal() {
        return estimatedTotal;
    }

    public void setEstimatedTotal(int estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }

    public List<resource> getResources() {
        return resources;
    }

    public void setResources(List<resource> resources) {
        this.resources = resources;
    }
}
