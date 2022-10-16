package codingbat;

import codingbat.Map1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
    void nathan_mapShare(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "a");
        map1.put("b", "b");
        map1.put("c", "c");
        Map<String, String> map2 = new HashMap<>();
        map2 = Map1.mapShare(map1);
        assertEquals("a", map2.get("b"));
        assertFalse(map2.containsKey("c"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "b");
        Map<String, String> map4 = new HashMap<>();
        map4 = Map1.mapShare(map3);
        assertEquals("b", map4.get("b"));

        Map<String, String> map5 = new HashMap<>();
        map5.put("a", "a");
        Map<String, String> map6 = new HashMap<>();
        map6 = Map1.mapShare(map5);
        assertTrue(map6.containsKey("b"));
        assertEquals("a", map6.get("b"));
    }

}