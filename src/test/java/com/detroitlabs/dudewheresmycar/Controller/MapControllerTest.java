package com.detroitlabs.dudewheresmycar.Controller;
import static org.junit.jupiter.api.Assertions.*;

import com.detroitlabs.dudewheresmycar.model.Map;
import com.detroitlabs.dudewheresmycar.service.MapService;
import org.junit.jupiter.api.Test;


class MapControllerTest {

    @Test
    void shouldDisplayCopyright() {
        MapService testMapService = new MapService();
        Map testMap = testMapService.fetchMyMap();
        String result = testMap.getCopyright();
        System.out.println("Result: " + result);
        assertEquals(result, "Copyright © 2022 Microsoft and its suppliers. All rights reserved. This API cannot be accessed and the content and any results may not be used, reproduced or transmitted in any manner without express written permission from Microsoft Corporation.");
    }

    @Test
    void estimatedTotalShouldReturn3() {
        MapService testMapService = new MapService();
        Map testMap = testMapService.fetchMyMap();
        int result = testMap.getResourceSets().get(0).getEstimatedTotal();
        System.out.println("Result " + result);
        assertEquals(result, 3);
    }

    @Test
    void displayNameShouldBeSeattle() {
        MapService testMapService = new MapService();
        Map testMap = testMapService.fetchMyMap();
        String result = testMap.getResourceSets().get(0).getResources().get(0).getName();

        System.out.println("Result " + result);
        assertEquals("Seattle, WA", result);
    }

    @Test
    void shouldReturnLatitude() {
        MapService testMapService = new MapService();
        Map testMap = testMapService.fetchMyMap();
        double result = testMap.getResourceSets().get(0).getResources().get(0).getPoint().getCoordinates().get(0);
        System.out.println("Result " + result);
        assertEquals(result, 47.60322952270508);
    }

    @Test
    void shouldReturnLongitude() {
        MapService testMapService = new MapService();
        Map testMap = testMapService.fetchMyMap();
        double result = testMap.getResourceSets().get(0).getResources().get(0).getPoint().getCoordinates().get(1);
        System.out.println("Result " + result);
        assertEquals(result, -122.33027648925781);
    }
}