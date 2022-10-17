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
    void john_topping3(){
        Map<String, String> map = new HashMap<>();
        map.put("potato","ranch");
        map.put("salad", "ceaser");
        Map<String, String> map1 = Map1.topping3(map);
        assertTrue(map1.containsKey("fries"));
        assertTrue(map1.containsKey("spinach"));
        assertEquals("ranch",map1.get("fries"));
        assertEquals("ceaser",map1.get("spinach"));

        Map<String, String> map2 = new HashMap<>();
        map2.put("corn","chicken");
        map2.put("orange", "sugar");
        Map<String, String> map3 = Map1.topping3(map2);
        assertFalse(map3.containsKey("fries"));
        assertFalse(map3.containsKey("spinach"));

    }

}