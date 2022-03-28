package com.detroitlabs.dudewheresmycar.Controller;

import com.detroitlabs.dudewheresmycar.model.Coordinates;
import com.detroitlabs.dudewheresmycar.model.Map;
import com.detroitlabs.dudewheresmycar.service.MapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
    MapService myMap = new MapService();

   // @ResponseBody //to get a response from a service
    @RequestMapping("/")

    public String displayMap(ModelMap modelMap) {
   //    Map map = myMap.fetchMyMap();
     //  modelMap.put("map", map);
        return "mainPage";
    }//end displayMap

    //test way to get coordinates from JSON API
    //@ResponseBody
    @RequestMapping("/coordinates")
    public String displayCoordinates() {
        Map test = myMap.fetchMyMap();
        //Coordinates coordinates = test.getCoordinates().get(0);
        System.out.println(test.getCoordinates());
       return "abc";
        //return "Test message latitude" + coordinates.getLatitude() + "Longitude" + coordinates.getLongitude();
    }
}


