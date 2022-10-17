package codingbat;

import codingbat.Map1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.Map1.mapBully;
import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void marc_mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertFalse(map2.containsKey("a"));
        assertFalse(map2.containsKey("b"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "cat");
        map3.put("b", "dog");
        Map<String, String> map4 = Map1.mapAB2(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("b"));

    }

    @Test
    void gideon_mapBully() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1=mapBully(map1);
        assertTrue(map1.containsKey("a"));
        assertTrue(map1.containsKey("b"));
        assertEquals("",map1.get("a"));
        assertEquals("candy",map1.get("b"));
        map1.put("a", "screamFest");
        map1=mapBully(map1);
        assertTrue(map1.containsKey("b"));
        assertFalse("candy",map1.get("b"));

    }

}