package com.detroitlabs.dudewheresmycar.Controller;
import static org.junit.jupiter.api.Assertions.*;

import com.detroitlabs.dudewheresmycar.model.Map;
import com.detroitlabs.dudewheresmycar.service.MapService;
import org.junit.jupiter.api.Test;


class MapControllerTest {

    @Test
    void displayName() {
        MapService testMapService = new MapService();
        Map testMap = testMapService.fetchMyMap();
        String result = testMap.getResourceSets().get(0).getResources().get(0).getName();

        System.out.println("Result " + result);
        assertEquals("Seattle, WA", result);
    }
}