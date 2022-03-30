package com.detroitlabs.dudewheresmycar.Controller;

import com.detroitlabs.dudewheresmycar.model.Coordinates;
import com.detroitlabs.dudewheresmycar.model.Map;
import com.detroitlabs.dudewheresmycar.model.resourceSet;
import com.detroitlabs.dudewheresmycar.service.MapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
    MapService myMap = new MapService();

    @RequestMapping("/mainPage")
    public String displayMap(ModelMap modelMap) {

        Map test = myMap.fetchMyMap();
        String city = "City/State " + test.getResourceSets().get(0).getResources().get(0).getName();
        String latitude = "Latitude " + test.getResourceSets().get(0).getResources().get(0).getPoint().getCoordinates().get(0);
        String longitude = "Longitude " + test.getResourceSets().get(0).getResources().get(0).getPoint().getCoordinates().get(1);
        double latitudeNumber = test.getResourceSets().get(0).getResources().get(0).getPoint().getCoordinates().get(0);
        double longitudeNumber = test.getResourceSets().get(0).getResources().get(0).getPoint().getCoordinates().get(1);
        modelMap.put("latNum", latitudeNumber);
        modelMap.put("longNum", longitudeNumber);
        modelMap.put("lat", latitude);
        modelMap.put("long", longitude);
        modelMap.put("city", city);
        return "mainPage";
    }

    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }

}


