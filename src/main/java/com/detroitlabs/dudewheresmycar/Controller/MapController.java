package com.detroitlabs.dudewheresmycar.Controller;

import com.detroitlabs.dudewheresmycar.model.Coordinates;
import com.detroitlabs.dudewheresmycar.model.Map;
import com.detroitlabs.dudewheresmycar.service.MapService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MapController {
    MapService myMap = new MapService();

    @ResponseBody //to get a response from a service
    @RequestMapping("/")

    public String displayMap(ModelMap modelMap) {
        Map map = myMap.fetchMyMap();
        modelMap.put("map", map);
        return "mainPage";
    }//end displayMap

    //test way to get coordinates from JSON API
//    @ResponseBody
    @RequestMapping("/coordinates")
    public String displayCoordinates() {
//        Map test = myMap.fetchMyMap();
//        Coordinates coordinates = test.getCoordinates().get(0);
        return "coordinates";
//        return "Test message latitude" + "Test message longitude";
    }
}


