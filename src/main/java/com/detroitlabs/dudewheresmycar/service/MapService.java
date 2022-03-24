package com.detroitlabs.dudewheresmycar.service;

import com.detroitlabs.dudewheresmycar.model.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component

public class MapService {
    public Map fetchMyMap(){
        RestTemplate restTemplate = new RestTemplate();
        //TODO: Change lat and long to a variable (look at sunnyday)
        return restTemplate.getForObject(
                "https://api.tomtom.com/map/1/staticimage?key=cVFgm2yRLc7uuukgYE69GhBTMQ32mdTc&zoom=9&center=13.567893,46.112341&format=jpg&layer=basic&style=main&width=1305&height=748&view=Unified&language=en-GB",Map.class);

    }
}
