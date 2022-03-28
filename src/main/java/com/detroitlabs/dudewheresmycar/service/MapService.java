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
                "http://dev.virtualearth.net/REST/v1/Locations?q=seattle&key=ApEA9xR5n09ZmerG_8I-6nU41Ar-q4zh4ZQb8YoYx-pGKcoPufhvPhELDOUDc_L4",Map.class);

    }
}
