package com.detroitlabs.dudewheresmycar.Controller;
import com.detroitlabs.dudewheresmycar.model.Map;
import com.detroitlabs.dudewheresmycar.model.Car;
import com.detroitlabs.dudewheresmycar.service.MapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Controller

public class LocationController {
    MapService myMap = new MapService();

    @ResponseBody //to get a response from a service
    @RequestMapping("/")

    public String displayMap(ModelMap modelMap){
        Map map = myMap.fetchMyMap();
        modelMap.put("map", map);
        return "mainPage";

    }//end displayMap
}
